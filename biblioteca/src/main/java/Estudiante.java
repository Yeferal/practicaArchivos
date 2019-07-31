
import java.io.Serializable;
/**
 *
 * @author César Reginaldo Tzoc Alvarado
 *         Carnet: 201430927
 */
public class Estudiante implements Serializable{
    
    String nombre;
    int carnet;
    int carrera;
    String fechaNacimiento;
    int limite;
    
    public Estudiante(int carnet, String nombre, int carrera){
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getCarrera() {
        return carrera;
    }
    
    public int getLimite() {
        return limite;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    public void setLimite(int librosPrestados){
        this.limite=librosPrestados;
    }
    
    public boolean verificacion(){
        if(limite<3){
            return false;
        }else{
            return true;
        }
        
        
    }
    public String toString(){
        String mensaje = "Nombre: "+nombre+" Carnet: "+carnet+"Carrera: "+carrera;
        return mensaje;
    } 
}
