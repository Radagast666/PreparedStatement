
package crud_dao;

/**
 *
 * @author radagast
 */
public interface DAO <T> {
    public void eliminar(Persona persona);
    public void agregar(Persona persona);
    public void actualizar(Persona persona);
    
}
