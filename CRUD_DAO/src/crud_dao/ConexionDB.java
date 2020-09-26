/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author radagast
 */
public class ConexionDB {
    private static ConexionDB con = null;
    private Connection connection = null;
    
     public static ConexionDB getInstance() {
        
        if(con == null){
            con = new ConexionDB();
        } 
        return con;
    }
     //Constructor privatizado para poder hacer singleton.
     private ConexionDB() {
    
        String url = "jdbc:postgresql://localhost:5432/conexion";
        String uname = "";
        String password = "";
        
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, uname, password);   
            
                
        } catch (SQLException e){         
            System.err.println("Problema de conexión\n"+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void execute(String sql, Persona persona, int x){
 
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            if(x==1){
                st.setString(1, persona.getID());
            }
            if(x==2){
                st.setString(1, persona.getNombre());
                st.setString(2, persona.getDireccion());
                st.setString(3, persona.getID());
            }
            if(x==3){
                st.setString(1, persona.getNombre());
                st.setString(2, persona.getDireccion());
                st.setString(3, persona.getID());
                st.setString(4, persona.getID());
                
            }
            
            ResultSet rs= st.executeQuery();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
            
        }
        ;
        
     }
    
}

