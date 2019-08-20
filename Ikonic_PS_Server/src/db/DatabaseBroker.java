/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.OpstiDomenskiObjekat;
import java.sql.Connection;
import util.Util;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nikola Ikonic
 */
public class DatabaseBroker {
    
    // TODO: Implementiraj ovo
    
    private Connection conn;
    
    public DatabaseBroker() {}
    
    public void otvoriKonekciju() throws Exception {
        String url = Util.getInstance().getURL();
        String user = Util.getInstance().getUser();
        String pass = Util.getInstance().getPassword(); 
        
        conn = DriverManager.getConnection(url, user, pass);
        conn.setAutoCommit(false);
    }
    
    public void zatvoriKonekciju() throws SQLException {
        conn.close();
    }
    
    public void potvrdiTransakciju() throws SQLException {
        conn.commit();
    }
    
    public void ponistiTransakciju() throws SQLException {
        conn.rollback();
    }
    
    public void insert(OpstiDomenskiObjekat o) {
        String query = "insert into " + o.vratiNazivTabele() + o.vratiAtributZaInsert() + " valuse(" + o.vratiVrednostiZaInsert() + ")";
    }
    
    
    /** ostatak operacija */
}
