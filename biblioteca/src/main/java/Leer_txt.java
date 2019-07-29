

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author yefer
 */
public class Leer_txt {
    
    String ruta= "practica1.txt";
    Datos datos = new Datos();
    registro registros = new registro(this);
    
    public Leer_txt(){
        
        leer();
        
    }
    
    public void leer(){
        
        try {
            FileReader tx = new FileReader(ruta);
            BufferedReader br = new BufferedReader(tx);
            
            for (int i = 0; i < 60; i++) {
                
                        switch (br.readLine()) {
            case "LIBRO":
                libro();
                datoslibro(br.readLine(),br.readLine(),br.readLine(),br.readLine());                            
                break;
            case "ESTUDIANTE":
                estudiante();
                datosEstudiante(br.readLine(),br.readLine(),br.readLine());  
                break;
            case "PRESTAMO":
                prestamo();
                datosPrestamo(br.readLine(),br.readLine(),br.readLine());
                break;
            default:
               
        }              
            }  
            datos.ver();
            br.close();
            
            
        } catch (Exception e) {
            
        }
        datos.ver();
        
    }

    
    public void libro(){
        System.out.println("es Libro");
    }
    public void estudiante(){
        System.out.println("es estudiante");
    }
    public void prestamo(){
        System.out.println("es prestamo");
    }
    
    public void datoslibro(String title, String autor, String codigo, String candidad){

        datos.nuevoLibro(title.substring(7), autor.substring(6), codigo.substring(7), Integer.parseInt(candidad.substring(9)));   
    }
    public void datosEstudiante(String carnet, String nombre, String carrera){
        datos.nuevoEstudiante(nombre.substring(7),Integer.parseInt(carnet.substring(7)), Integer.parseInt(carrera.substring(8)), " null");
    }
    
    public void datosPrestamo(String codigo, String carnet, String fecha){
        datos.nuevoPrestamo(codigo.substring(12), Integer.parseInt(carnet.substring(7)), fecha.substring(6));
    }
    
    //Metodo para serializar los objetos, libros, estudiantes, prestamos
    public void GuardarObjetos(){
        
        try{
            ObjectOutputStream guardarLibros = new ObjectOutputStream(new FileOutputStream("libros.txt"));
            guardarLibros.writeObject(datos.libros);
            guardarLibros.close();
            
            ObjectOutputStream guardarEstudiantes = new ObjectOutputStream(new FileOutputStream("estudiantes.txt"));
            guardarEstudiantes.writeObject(datos.estudiantes);
            guardarEstudiantes.close();
            
        }catch(Exception e){
            
        }

        try{
            
            ObjectOutputStream guardarPrestamos = new ObjectOutputStream(new FileOutputStream("prestamos.txt"));
            guardarPrestamos.writeObject(datos.register);
            guardarPrestamos.close();
            
        }catch(Exception e){}
    }
    
    
    public void CargarObjetos() throws FileNotFoundException, IOException{
        try{
            ObjectInputStream cargarLibros = new ObjectInputStream(new FileInputStream("libros.txt"));
            ArrayList<Libro> librosRecuperados = (ArrayList<Libro>) cargarLibros.readObject();
            cargarLibros.close();
            
            for(int i=0; i<librosRecuperados.size(); i++){
                datos.libros.add(librosRecuperados.get(i)); 
            }
            
            ObjectInputStream cargarEstudiantes = new ObjectInputStream(new FileInputStream("estudiantes.txt"));
            ArrayList<Estudiante> estudiantesRecuperados = (ArrayList<Estudiante>) cargarEstudiantes.readObject();
            cargarEstudiantes.close();
            
            for(int i=0; i<estudiantesRecuperados.size(); i++){
                datos.estudiantes.add(estudiantesRecuperados.get(i));
            }
            
        }catch(Exception e){}           
        
        try{
            ObjectInputStream cargarPrestamos = new ObjectInputStream(new FileInputStream("prestamos.txt"));
            ArrayList<Prestamo> prestamosRecuperados = (ArrayList<Prestamo>) cargarPrestamos.readObject();
            cargarPrestamos.close();
            
            for(int i=0; i<prestamosRecuperados.size(); i++){
                datos.register.add(prestamosRecuperados.get(i));
            }
        }catch(Exception e){}
    }
         
    /**
    public void generarArchLibros(){
        
        for (int i = 0; i < datos.libros.size(); i++) {
            String nombreL="libros/"+datos.libros.get(i).getTitulo()+".bin";
            File fichero= new File(nombreL);
            FileOutputStream fil;
            ObjectOutputStream dat;
            try {
                fil = new FileOutputStream(fichero);
                dat = new ObjectOutputStream(fil);
                dat.writeObject(datos.libros.get(i));
                dat.close();
                
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
    public void leerArchLibros(){
        for (int i = 0; i < datos.libros.size(); i++) {
            String nombreL="libros/"+datos.libros.get(i).getTitulo()+".bin";
            File fichero= new File(nombreL);
            FileOutputStream fil;
            ObjectOutputStream dat;
            try {
                fil = new FileOutputStream(fichero);
                dat = new ObjectOutputStream(fil);
                dat.writeObject(datos.libros.get(i));
                dat.close();
                
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
        public void generarArchEstudiantes(){
        for (int i = 0; i < datos.estudiantes.size(); i++) {
            String nombreL="estudiantes/"+datos.estudiantes.get(i).carnet+".bin";
            File fichero= new File(nombreL);
            FileOutputStream fil;
            ObjectOutputStream dat;
            try {
                fil = new FileOutputStream(fichero);
                dat = new ObjectOutputStream(fil);
                dat.writeObject(datos.estudiantes.get(i));
                dat.close();
                
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
        
    public void generarArchPrestamos(){
        for (int i = 0; i < datos.estudiantes.size(); i++) {
            String nombreL="prestamos/"+datos.estudiantes.get(i).carnet+".bin";
            File fichero= new File(nombreL);
            FileOutputStream fil;
            ObjectOutputStream dat;
            try {
                fil = new FileOutputStream(fichero);
                dat = new ObjectOutputStream(fil);
                dat.writeObject(datos.estudiantes.get(i));
                dat.close();
                
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
    **/
}
