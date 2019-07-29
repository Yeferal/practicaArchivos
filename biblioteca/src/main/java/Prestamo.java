
import java.io.Serializable;
/**
 *
 * @author cesar31
 */
public class Prestamo implements Serializable {
    
    Estudiante estudiante;//borrar
    Libro libro;//borrar
    
    String codigoL;
    int carnetE;
    boolean estado;
    String fechaPrestamo;
    String fechaDevolucion;
    int montoAPagar;
    
    
    public Prestamo(int carnetE, String codigoL, String fechaPrestamo){
        this.carnetE = carnetE;
        this.codigoL = codigoL;
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getCodigoL() {
        return codigoL;
    }

    public int getCarnetE() {
        return carnetE;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getMontoAPagar() {
        return montoAPagar;
    }

    public void setCodigoL(String codigoL) {
        this.codigoL = codigoL;
    }

    public void setCarnetE(int carnetE) {
        this.carnetE = carnetE;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setMontoAPagar(int montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    public void presto(){
        estado=true;
        estudiante.limite++;
        libro.cantidad--;
    }
    public void regreso(){
        estado= false;
        estudiante.limite--;
        libro.cantidad++;
    }
    
    public String toString(){
        String mensaje = "Carnet: "+carnetE+" Libro: "+codigoL+" Fecha: "+fechaPrestamo;
        return mensaje;
    }
}
