/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_dao;

import java.sql.ResultSet;

/**
 *
 * @author radagast
 */
public class DAOImplementacion implements DAO {

    @Override
    public void eliminar(Persona persona) {
        String consulta = "DELETE from persona where ID = ?";
        ConexionDB con = ConexionDB.getInstance();
        con.execute(consulta, persona, 1);
    }

    @Override
    public void agregar(Persona persona) {
        String consulta = "INSERT INTO persona(Nombre, Direccion, ID) values(?, ?, ?)";
        ConexionDB con = ConexionDB.getInstance();
        con.execute(consulta, persona, 2);
    }

    @Override
    public void actualizar(Persona persona) {
          String consulta = "UPDATE persona set Nombre= ?, Direccion = ?, WHERE ID = ?";
        ConexionDB con = ConexionDB.getInstance();
        con.execute(consulta, persona, 3);
    }
    
    
}
