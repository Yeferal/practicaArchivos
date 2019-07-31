
import java.io.Serializable;
/**
 *
 * @author cesar31
 */
public class Prestamo implements Serializable {
    
    String codigoL;
    int carnetE;
    boolean estado, estado2, estado3;
    String fechaPrestamo, fechaPrestamo2, fechaPrestamo3;
    String fechaDevolucion;
    int montoAPagar;
    int cantidad;
    
    
    public Prestamo(int carnetE, String codigoL, String fechaPrestamo){
        estado = true;
        this.carnetE = carnetE;
        this.codigoL = codigoL;
        this.fechaPrestamo = fechaPrestamo;
        cantidad = 1;
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

    public boolean isEstado2() {
        return estado2;
    }

    public boolean isEstado3() {
        return estado3;
    }

    public String getFechaPrestamo2() {
        return fechaPrestamo2;
    }

    public String getFechaPrestamo3() {
        return fechaPrestamo3;
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

    public int getCantidad() {
        return cantidad;
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado2(boolean estado2) {
        this.estado2 = estado2;
    }

    public void setEstado3(boolean estado3) {
        this.estado3 = estado3;
    }

    public void setFechaPrestamo2(String fechaPrestamo2) {
        this.fechaPrestamo2 = fechaPrestamo2;
    }

    public void setFechaPrestamo3(String FechaPrestamo3) {
        this.fechaPrestamo3 = fechaPrestamo3;
    }
    
    public String toString(){
        String mensaje = "Carnet: "+carnetE+" Libro: "+codigoL+" Fecha: "+fechaPrestamo+
                "\nFecha2: "+fechaPrestamo2+" Fecha3: "+fechaPrestamo3+" Limite: "+cantidad;
        return mensaje;
    }
}
