/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.OpstiDomenskiObjekat;
import kontroler.ServerskiKontroler;

/**
 *
 * @author Nikola Ikonic
 */
public class RegistracijaSO extends OpstaSO {

    @Override
    protected void izvrsiOperaciju(OpstiDomenskiObjekat o) throws Exception {
        ServerskiKontroler.getInstance().insert(o);//To change body of generated methods, choose Tools | Templates.
    }
    
}
