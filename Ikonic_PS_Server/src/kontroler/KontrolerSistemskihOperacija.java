package kontroler;

import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikola Ikonic
 */
public class KontrolerSistemskihOperacija {

    private static KontrolerSistemskihOperacija instance;

    private KontrolerSistemskihOperacija() {
    }

    ;
    
    public static KontrolerSistemskihOperacija getInstance() {
        if (instance == null) {
            instance = new KontrolerSistemskihOperacija();
        }
        return instance;
    }
    
    public TransferObjekatOdgovor obradiSistemskuOperaciju(TransferObjekatZahtev zahtev) {
        // TODO: Implementiraj logiku!2
        
        return new TransferObjekatOdgovor(null, "Nisi implementirao ovo", Konstante.GRESKA);
    }
    
}
