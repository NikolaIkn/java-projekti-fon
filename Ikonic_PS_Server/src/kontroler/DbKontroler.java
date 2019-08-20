/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import db.DatabaseBroker;
import domen.OpstiDomenskiObjekat;
import java.sql.SQLException;

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
    
    public void otvoriKonekciju() throws Exception {
        db.otvoriKonekciju();
    }
    
    public void zatvoriKonekciju() throws SQLException {
        db.zatvoriKonekciju();
    }
    
    public void potvrdiTransakciju() throws SQLException {
        db.potvrdiTransakciju();
    }
    
    public void ponistiTransakciju() throws SQLException {
        db.ponistiTransakciju();
    }
    
    public void insert(OpstiDomenskiObjekat o) {
        db.insert(o);
    }
    /** insert, update, ... */
}
