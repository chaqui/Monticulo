    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficamonticulos;

/**
 *
 * @author chaqui
 */
public class Usuario {
    private int clave;
    private String nombre;
    private String elefono;

    public Usuario(int clave, String nombre, String elefono) {
        this.setClave(clave);
        this.setElefono(elefono);
        this.setNombre(nombre);        
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getElefono() {
        return elefono;
    }

    public void setElefono(String elefono) {
        this.elefono = elefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
