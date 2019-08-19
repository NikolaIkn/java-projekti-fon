package niti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikola Ikonic
 */
public class ServerskaNit extends Thread {
    private volatile boolean kraj;
    private List<KlijentskaNit> klijentskeNiti;
    private ServerSocket ss;
    
    public ServerskaNit() {
        klijentskeNiti = new ArrayList<>();
    }
    
    @Override
    public void run() {
        System.out.println("Pokrenuta serverska nit!");
        try {
            ss = new ServerSocket(9000);
            
            while (!kraj) {
                Socket socket = ss.accept();
                KlijentskaNit nit = new KlijentskaNit(socket);
                klijentskeNiti.add(nit);
                nit.start();
            }
        } catch (IOException ex) {
            System.out.println("IO ex");
        } catch (Exception ex){
            System.out.println("Server je zaustavljen!"); //XXX
        }
    }
    
    
    public void zatvoriServer(){
        try {
            for(KlijentskaNit klijentskaNit : klijentskeNiti){
                klijentskaNit.zatvoriNit();
            }
            klijentskeNiti.clear();
            kraj = true;
            this.interrupt();
            ss.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerskaNit.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Prekinut rad servera");
        }
    }
    /**
     * TODO: Zatvori server i ukloni svo ovo djubre
     * public void zatvoriServer() {
     *      .........
     * }
     */
}
