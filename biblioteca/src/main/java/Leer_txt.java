

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
                
                //System.out.println(br.readLine());
                //tipo(br.readLine());
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
        //System.out.println("no es nada");
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
    
}
