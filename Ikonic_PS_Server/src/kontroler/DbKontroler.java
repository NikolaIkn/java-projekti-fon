/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import db.DatabaseBroker;

/**
 *
 * @author Nikola Ikonic
 */
public class DbKontroler {
    private static DbKontroler instance;
    private DatabaseBroker db;
    
    private DbKontroler() {
        this.db = new DatabaseBroker();
    }
    
    public static DbKontroler getInstance() {
        if (instance == null) {
            instance = new DbKontroler();
        }
        
        return instance;
    }
    
    public void otvoriKonekciju() {
        db.otvoriKonekciju();
    }
    
    public void zatvoriKonekciju() {
        db.zatvoriKonekciju();
    }
    
    public void potvrdiTransakciju() {
        db.potvrdiTransakciju();
    }
    
    public void ponistiTransakciju() {
        db.ponistiTransakciju();
    }
    
    /** insert, update, ... */
}
