/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Youssef Almia
 */
public class ConnectionClass {
    
  public  Connection con = null ;
  
  public Connection getConnection(){
      
      try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          
          con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Youssef123");
      }catch( Exception e){
          e.printStackTrace();
      }
      return con;
  }
    
    
    
}
