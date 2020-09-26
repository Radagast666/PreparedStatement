
package crud_dao;

/**
 *
 * @author radagast
 */
public class Persona {
    private String nombre, direccion, ID;
    
    public Persona(String nombre, String direccion, String ID){
        this.ID=ID;
        this.nombre =nombre;
        this.direccion=direccion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public String getID(){
        return ID;
    }

}
