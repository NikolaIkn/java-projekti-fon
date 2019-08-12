package transfer;


import domen.OpstiDomenskiObjekat;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikola Ikonic
 */
public class TransferObjekatZahtev implements Serializable{
    private int operacija;
    private OpstiDomenskiObjekat objekat;

    public TransferObjekatZahtev() {
    }

    public TransferObjekatZahtev(int operacija, OpstiDomenskiObjekat objekat) {
        this.operacija = operacija;
        this.objekat = objekat;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public OpstiDomenskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(OpstiDomenskiObjekat objekat) {
        this.objekat = objekat;
    }
    
    
}
