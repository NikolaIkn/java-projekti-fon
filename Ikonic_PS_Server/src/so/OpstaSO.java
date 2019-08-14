/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.OpstiDomenskiObjekat;

/**
 *
 * @author Nikola Ikonic
 */
public abstract class OpstaSO {
    
    private void otvoriKonekciju() {}
    
    private void zatvoriKonekciju() {}
    
    private void potvrdiTransakciju() {}
    
    private void ponistiTransakciju() {}
    
    // Ova mozda ne treba?
    protected void proveriPreduslov() {}
    
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
