/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import kontroler.ServerskiKontroler;

/**
 *
 * @author Nikola Ikonic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerskiKontroler.getInstance().pokreniServer();        
    }
    
}
