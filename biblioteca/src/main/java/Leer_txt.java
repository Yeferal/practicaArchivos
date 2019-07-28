

import java.io.*;
/**
 *
 * @author yefer
 */
public class Leer_txt {
    
    String ruta= "practica1.txt";
    Datos datos = new Datos();
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
    }
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
}
