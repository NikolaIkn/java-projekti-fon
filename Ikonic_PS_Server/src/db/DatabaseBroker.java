/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import util.Util;

/**
 *
 * @author Nikola Ikonic
 */
public class DatabaseBroker {
    
    // TODO: Implementiraj ovo
    
    private Connection conn;
    
    public DatabaseBroker() {}
    
    public void otvoriKonekciju() {
        // String url = Util.getInstance().getUrl();
        // ...
    }
    
    public void zatvoriKonekciju() {}
    
    public void potvrdiTransakciju() {}
    
    public void ponistiTransakciju() {}
    
    /** ostatak operacija */
}
