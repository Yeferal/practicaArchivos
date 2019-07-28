


/**
 *
 * @author cesar31
 */
public class Prestamo {
    
    Estudiante estudiante;
    Libro libro;
    boolean estado;
    String fechaPrestamo;
    String fechaDevolucion;
    int montoAPagar;
    
    
    public Prestamo(Estudiante estudiante, Libro libro, String fechaPrestamo){
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
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

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
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
}
