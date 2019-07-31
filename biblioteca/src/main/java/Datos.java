
import java.util.ArrayList; 

/**
 *
 * @author yefer
 */
public class Datos {
    
    ArrayList<Estudiante> estudiantes =new ArrayList<Estudiante>();
    ArrayList<Libro> libros =new ArrayList<Libro>();
    ArrayList<Prestamo> register= new ArrayList<Prestamo>();
    Leer_txt tx;
    
    public Datos (Leer_txt tx){
        this.tx = tx;
        
    }
    
    //Metodo para crear nuevoe estudiante, despues de leer practica1.txt
    public void nuevoEstudiante(String nombre, int carnet, int carrera, String fecha){
        Estudiante es =  new Estudiante(carnet, nombre, carrera);
        tx.guardarEstudiantes(carnet, es);
        System.out.println(es.toString());
        
    }
    
    //Metodo para crear nuevo libro despues de leer practica1.txt
    public void nuevoLibro(String titulo ,String autor, String codigo, int cantidad){
        Libro lb =  new Libro(titulo, autor, codigo, cantidad);
        tx.guardarLibros(codigo, lb);
    }
    
    //Metodo para crear nuevo prestamo depues de leer practica1.txt
    public void nuevoPrestamo(String codigo, int carnet, String fecha){
        
        Prestamo tmp = new Prestamo (carnet, codigo, fecha);
        register.add(tmp);
        //tx.guardarPrestamos(codigo, carnet, tmp);
    }
    
    /**
     * Metodo para verificar si algun estudiante tiene mas de un prestamo y concatenarlo en
     * un solo objeto
     */
    
    public void verificarPrestamos(){
        for(int i=0; i<register.size(); i++){
            for(int j=i+1; j<register.size(); j++){
                if(register.get(i).getCarnetE() == register.get(j).getCarnetE()){
                    if(register.get(i).getCodigoL().equals(register.get(j).getCodigoL())){

                        if(register.get(i).getFechaPrestamo2()==null){
                            register.get(i).setCantidad(register.get(i).getCantidad()+1);
                            register.get(i).setFechaPrestamo2(register.get(j).getFechaPrestamo());
                            register.get(i).setEstado2(true);
                        }else if(register.get(i).getFechaPrestamo3()==null){
                            register.get(i).setCantidad(register.get(i).getCantidad()+1);
                            register.get(i).setFechaPrestamo3(register.get(j).getFechaPrestamo());
                            register.get(i).setEstado3(true);
                        }
                        register.remove(j);
                        
                    }                    
                }
            }
        }
        
        
        
        for(int z=0; z<register.size(); z++){
            
            
            tx.guardarPrestamos(register.get(z).getCodigoL(), register.get(z).getCarnetE(), register.get(z));

        }
    }
    
    
    
    
    /**
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
    * */
}
