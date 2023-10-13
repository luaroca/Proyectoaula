package Main;

/**
 *
 * @author LUIS MANUEL
 */
public class Usuario {
    
   String nombre;
   String numCedula;
   String rol;

    public Usuario(String nombre, String numCedula, String rol) {
        this.nombre = nombre;
        this.numCedula = numCedula;
        this.rol= rol;
    }

    public Usuario(String nombre, String numCedula) {
        this.nombre = nombre;
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    public String getNumCedula() {
        return numCedula;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
