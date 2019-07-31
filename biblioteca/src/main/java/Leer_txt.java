

import java.io.*;
/**
 *
 * @author yefer
 */
public class Leer_txt {
    
    String ruta = "practica1.txt";
    boolean cargado;
    Datos datos = new Datos(this);
    
    errores error = new errores(this);
    public Leer_txt(){
        
        //leer(ruta);
    }
    //Revisa si la linea del archivo es correcta si si verifica las lineas siguientes para crear un
    //archivo dependiendo del tipo
    public void leer(String fichero){
        String tituloNombreFecha;
        String carnetCodigolibro;
        String cantidad;
        String autorCarreraCodigo;
        int contador=0;
        try{
            FileReader tx = new FileReader(fichero);
            BufferedReader br = new BufferedReader(tx);

            for (int i = 0; i < 120; i++) {
                
                switch (br.readLine()) {
                    case "LIBRO":
                        libro();

                        tituloNombreFecha=br.readLine();
                        autorCarreraCodigo=br.readLine();
                        carnetCodigolibro=br.readLine();
                        cantidad=br.readLine();
                        contador= contador+4;
                        if(vdatoslibros(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro,cantidad)){
                            libro();
                            
                            datoslibro(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro,cantidad);
                        }
                        
                        break;
                    case "ESTUDIANTE":
                        tituloNombreFecha=br.readLine();
                        autorCarreraCodigo=br.readLine();
                        carnetCodigolibro=br.readLine();
                        contador= contador+4;
                        if(vdatosEstudiante(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro)){
                            estudiante();
                            
                            datosEstudiante(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro);
                        }else{
                            
                        }
                         
                        break;
                    case "PRESTAMO":
                        tituloNombreFecha=br.readLine();
                        autorCarreraCodigo=br.readLine();
                        carnetCodigolibro=br.readLine();
                        contador= contador+4;
                        if(vdatosPrestamos(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro)){
                            prestamo();
                            datosPrestamo(tituloNombreFecha,autorCarreraCodigo,carnetCodigolibro);
                        }
                        
                        break;
                    default:
                        error.agregarfila("Error con dato desconocodo, no se agrego un dato verifique la estructura del documento"+"\nel error se encuentra en la fila: "+contador);
                        break;
                }              
            }  
            br.close();     
        }catch(Exception e){
            
        }
        error.setVisible(true);
    }
    //Verifica si cumple con los parametrso de una linea para libros
    public boolean vdatoslibros(String titulo, String autor, String codigo, String candidad){
        if(titulo.substring(0, 7).equals("TITULO:") && autor.substring(0, 6).equals("AUTOR:") && codigo.substring(0, 7).equals("CODIGO:") && candidad.substring(0, 9).equals("CANTIDAD:")){
            return true;
        }else{
            error.agregarfila("Error en ingresar libro no cumplio con todos los parametros requeridos");
            return false;
        }
    }
    //Verifica si cumple con los parametrso de una linea para Estudiantes
    public boolean vdatosEstudiante(String carnet, String nombre, String carrera){
        if(carnet.substring(0, 7).equals("CARNET:") && nombre.substring(0, 7).equals("NOMBRE:") && carrera.substring(0, 8).equals("CARRERA:") ){
            return true;
        }else{
            error.agregarfila("Error en ingresar estudiante no cumplio con todos los parametros requeridos");
            return false;
        }
    }
    //Verifica si cumple con los parametrso de una linea para Pretamos
    public boolean vdatosPrestamos(String codigo, String carnet, String fecha){
        if(codigo.substring(0, 12).equals("CODIGOLIBRO:") && carnet.substring(0, 7).equals("CARNET:") && fecha.substring(0, 6).equals("FECHA:") ){
            return true;
        }else{
            error.agregarfila("Error en ingresar prestamo no cumplio con todos los parametros requeridos");
            return false;
        }
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
    //evia los parametrso para crear una archivo en la clase datos
    public void datoslibro(String title, String autor, String codigo, String candidad){

        if(title.substring(0, 5).equals("TITULO")){
            
        }else{
            //error en el tititulo del libro no cumple con los parametros
        }
        datos.nuevoLibro(title.substring(7), autor.substring(6), codigo.substring(7), Integer.parseInt(candidad.substring(9)));   
    }
    //evia los parametrso para crear una archivo en la clase datos
    public void datosEstudiante(String carnet, String nombre, String carrera){
        datos.nuevoEstudiante(nombre.substring(7),Integer.parseInt(carnet.substring(7)), Integer.parseInt(carrera.substring(8)), " null");
    }
    //evia los parametrso para crear una archivo en la clase datos
    public void datosPrestamo(String codigo, String carnet, String fecha){
        datos.nuevoPrestamo(codigo.substring(12), Integer.parseInt(carnet.substring(7)), fecha.substring(6));
    }
    
    //Metodo para serializar los objetos, libros, estudiantes, prestamos
    public void guardarLibros(String codigo, Libro tmp){
        String ruta = "libros/"+codigo+".bin";
        try{
            ObjectOutputStream guardarLibro = new ObjectOutputStream(new FileOutputStream(ruta));
            guardarLibro.writeObject(tmp);
            guardarLibro.close();
            
        }catch(Exception e){
            System.out.println("no guarda libros");
        }
    }
    //GUarda los estudiantes en archivos de objetos con el nombre como carnet
    public void guardarEstudiantes(int carnet, Estudiante tmp){
        String ruta = "estudiantes/"+carnet+".bin";
        try{
            ObjectOutputStream guardarEstudiante = new ObjectOutputStream(new FileOutputStream(ruta));
            guardarEstudiante.writeObject(tmp);
            guardarEstudiante.close();
            
        }catch(Exception e){
            System.out.println("no guarda estudiantes");
        }
    }
    //GUarda los prestamos en archivos de objetos con el nombre como codigo mas carnet
    public void guardarPrestamos(String codigo, int carnet, Prestamo tmp){
        String ruta = "prestamos/"+codigo+carnet+".bin";
        try{
            ObjectOutputStream guardarPrestamo = new ObjectOutputStream(new FileOutputStream(ruta));
            guardarPrestamo.writeObject(tmp);
            guardarPrestamo.close();
            
        }catch(Exception e){
            System.out.println("no guarda prestamos");
        }
    }
    
}
