
import java.util.ArrayList; 

/**
 *
 * @author yefer
 */
public class Datos {
    
    ArrayList<Estudiante> estudiantes =new ArrayList<Estudiante>();
    ArrayList<Libro> libros =new ArrayList<Libro>();
    
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
}
