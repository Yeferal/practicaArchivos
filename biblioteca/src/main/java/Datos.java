
import java.util.ArrayList; 
import java.io.Serializable;

/**
 *
 * @author yefer
 */
public class Datos implements Serializable {
    
    ArrayList<Estudiante> estudiantes =new ArrayList<Estudiante>();
    ArrayList<Libro> libros =new ArrayList<Libro>();
    ArrayList<Prestamo> register= new ArrayList<Prestamo>();
    
    public Datos (){
        
        
    }
    
    public void nuevoEstudiante(String nombre, int carnet, int carrera, String fecha){
        Estudiante es =  new Estudiante(carnet, nombre, carrera);
        estudiantes.add(es);
        
    }
    public void nuevoLibro(String titulo ,String autor, String codigo, int cantidad){
        Libro lb =  new Libro(titulo, autor, codigo, cantidad);
        libros.add(lb);
        
    }
    
    public void nuevoPrestamo(String codigo, int carnet, String fecha){
        boolean cod = false;
        boolean carn = false;
        
        for(int i=0; i<libros.size(); i++){
            if(codigo.equalsIgnoreCase(libros.get(i).getCodigo())){
                cod = true;
                break;
            }
        }
        
        for(int i=0; i<estudiantes.size(); i++){
            if(carnet == estudiantes.get(i).getCarnet()){
                carn = true;
                break;
            }
        }
        
        if(cod && carn){
            Prestamo tmp = new Prestamo (carnet, codigo, fecha);
            register.add(tmp);
        }
        
    }
    
    public void ver(){
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).titulo);  
        }
    }
    
    public void verEstudiantes(){
        for(int i=0; i<estudiantes.size(); i++){
            System.out.println(estudiantes.get(i).toString());
        }
    }
    
    public void verPrestamos(){
        for(int i=0; i<register.size(); i++){
            System.out.println(register.get(i).toString());
        }
    }
}
