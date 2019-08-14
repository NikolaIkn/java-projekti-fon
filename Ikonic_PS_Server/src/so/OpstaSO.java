/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.OpstiDomenskiObjekat;
import kontroler.DbKontroler;

/**
 *
 * @author Nikola Ikonic
 */
public abstract class OpstaSO {
    
    private void otvoriKonekciju() {
        DbKontroler.getInstance().otvoriKonekciju();
    }
    
    private void zatvoriKonekciju() {
        DbKontroler.getInstance().zatvoriKonekciju();
    }
    
    private void potvrdiTransakciju() {
        DbKontroler.getInstance().potvrdiTransakciju();
    }
    
    private void ponistiTransakciju() {
        DbKontroler.getInstance().ponistiTransakciju();
    }
    
    // Ovo mozda ni ne treba, ako kojim slucajem zatreba negde overrideuj u 
    // child klasi
    protected void proveriPreduslov() {
        System.out.println("Sve je kul");
    }
    
    protected abstract void izvrsiOperaciju(OpstiDomenskiObjekat o) throws Exception;
    
    public void izvrsenjeSO(OpstiDomenskiObjekat o) throws Exception {
        try {
            otvoriKonekciju();
            proveriPreduslov();
            izvrsiOperaciju(o);
            potvrdiTransakciju();
            zatvoriKonekciju();
        } catch (Exception e) {
            ponistiTransakciju();
            zatvoriKonekciju();
            e.printStackTrace();
            throw new Exception("Greska kod izvrsenja SO: " + e.getMessage());
        }
    }
}
