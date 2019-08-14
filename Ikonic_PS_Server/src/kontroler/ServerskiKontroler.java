package kontroler;

import niti.ServerskaNit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikola Ikonic
 */
public class ServerskiKontroler {
    
    public static ServerskiKontroler instance;
    private ServerskaNit server;
    
    private ServerskiKontroler() {
    }
    
    public static ServerskiKontroler getInstance() {
        if(instance == null) {
            instance = new ServerskiKontroler();
        }
        return instance;
    }
    
    public void pokreniServer() {
        if (server == null) {
            server = new ServerskaNit();
        }
        server.start();
    }
}
