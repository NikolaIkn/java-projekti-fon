/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import kontroler.KontrolerSistemskihOperacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;
import util.Konstante;

/**
 *
 * @author Nikola Ikonic
 */
public class KlijentskaNit extends Thread{
    
    private Socket socket;
    private volatile boolean kraj;
    
    public KlijentskaNit(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try {
            while(!kraj) {
                TransferObjekatZahtev zahtev = primiZahtev();
            }
        } catch (IOException ex) {
            Logger.getLogger(KlijentskaNit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentskaNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private TransferObjekatZahtev primiZahtev() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        return (TransferObjekatZahtev) in.readObject();
    }
    
    private void izvrsiOperaciju(TransferObjekatZahtev zahtev) {
        // FIXME: Pozovi kontroler sistemskih operacija i vrati odgovor
        posaljiOdgovor(KontrolerSistemskihOperacija.getInstance().obradiSistemskuOperaciju(zahtev));
    }
    
    private void posaljiOdgovor(TransferObjekatOdgovor odgovor) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(odgovor);
        } catch (IOException ex) {
            Logger.getLogger(KlijentskaNit.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
