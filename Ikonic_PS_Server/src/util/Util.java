/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Nikola Ikonic
 */
public class Util {
    private Properties prop;
    private static Util instance;
    
    private Util() throws Exception {
        prop = new Properties();
        prop.load(new FileInputStream("props/DbProps.properties"));
    }
    
    public static Util getInstance() throws Exception{
        if (instance == null) {
            instance = new Util();
        }
        
        return instance;
    }
    
    public String getUser(){
        return prop.getProperty("user", "");
    }
    
    public String getPassword(){
        return prop.getProperty("password", "");
    }
    
    public String getHost(){
        return prop.getProperty("host", "");
    }
    
    public String getPort(){
        return prop.getProperty("port", "");
    }
    
    public String getDB(){
        return prop.getProperty("db", "");
    }
    
    public String getURL(){
        return "jdbc:mysql://"+getHost()+":"+getPort()+"/"+getDB();
    }
}
