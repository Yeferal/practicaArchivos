

import java.io.*;
import java.util.ArrayList;
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
    
    public void leer(String fichero){
        String tituloNombreFecha;
        String carnetCodigolibro;
        String cantidad;
        String autorCarreraCodigo;
        int contador=0;
        try{
            FileReader tx = new FileReader(fichero);
            BufferedReader br = new BufferedReader(tx);
            
            long lNumeroLineas = 0;
            /**
            while (br.readLine()!=null) {
            lNumeroLineas++;
            }
            **/
            
            System.out.println(lNumeroLineas);
            //br.reset();
            for (int i = 0; i < 60; i++) {
                
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
                        //estudiante();
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
                        //prestamo();
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
    
    public boolean vdatoslibros(String titulo, String autor, String codigo, String candidad){
        if(titulo.substring(0, 7).equals("TITULO:") && autor.substring(0, 6).equals("AUTOR:") && codigo.substring(0, 7).equals("CODIGO:") && candidad.substring(0, 9).equals("CANTIDAD:")){
            return true;
        }else{
            error.agregarfila("Error en ingresar libro no cumplio con todos los parametros requeridos");
            return false;
        }
    }
    
    public boolean vdatosEstudiante(String carnet, String nombre, String carrera){
        if(carnet.substring(0, 7).equals("CARNET:") && nombre.substring(0, 7).equals("NOMBRE:") && carrera.substring(0, 8).equals("CARRERA:") ){
            return true;
        }else{
            error.agregarfila("Error en ingresar estudiante no cumplio con todos los parametros requeridos");
            return false;
        }
    }
    
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
    
    public void datoslibro(String title, String autor, String codigo, String candidad){

        if(title.substring(0, 5).equals("TITULO")){
            
        }else{
            //error en el tititulo del libro no cumple con los parametros
        }
        datos.nuevoLibro(title.substring(7), autor.substring(6), codigo.substring(7), Integer.parseInt(candidad.substring(9)));   
    }
    public void datosEstudiante(String carnet, String nombre, String carrera){
        datos.nuevoEstudiante(nombre.substring(7),Integer.parseInt(carnet.substring(7)), Integer.parseInt(carrera.substring(8)), " null");
    }
    
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
    
    /**
    public void GuardarObjetos(){
        
        try{
            ObjectOutputStream guardarLibros = new ObjectOutputStream(new FileOutputStream("libros.txt"));
            guardarLibros.writeObject(datos.libros);
            guardarLibros.close();
            
        }catch(Exception e){
            System.out.println("no guarda libros");
        }
        
        try{
            ObjectOutputStream guardarEstudiantes = new ObjectOutputStream(new FileOutputStream("estudiantes.txt"));
            guardarEstudiantes.writeObject(datos.estudiantes);
            guardarEstudiantes.close();
            
        }catch(Exception e){
            System.out.println("no guarda estudiantes");
        }
        
        try{
            ObjectOutputStream guardarPrestamos = new ObjectOutputStream(new FileOutputStream("prestamos.txt"));
            guardarPrestamos.writeObject(datos.register);
            guardarPrestamos.close();
            
        }catch(Exception e){
            System.out.println("no guarda prestamos");
        }
    }
    
    
    
    public void CargarObjetos() throws FileNotFoundException, IOException{
        int contador=0;
        try{
            ObjectInputStream cargarLibros = new ObjectInputStream(new FileInputStream("libros.txt"));
            ArrayList<Libro> librosRecuperados = (ArrayList<Libro>) cargarLibros.readObject();
            cargarLibros.close();
            
            for(int i=0; i<librosRecuperados.size(); i++){
                datos.libros.add(librosRecuperados.get(i)); 
            }
            
        }catch(Exception e){
            contador++;
            System.out.println(contador);
        }
        
        try{
            ObjectInputStream cargarEstudiantes = new ObjectInputStream(new FileInputStream("estudiantes.txt"));
            ArrayList<Estudiante> estudiantesRecuperados = (ArrayList<Estudiante>) cargarEstudiantes.readObject();
            cargarEstudiantes.close();
            
            for(int i=0; i<estudiantesRecuperados.size(); i++){
                datos.estudiantes.add(estudiantesRecuperados.get(i));
            }
        }catch(Exception e){
            contador++;
            System.out.println(contador);
        }
        
        try{
            ObjectInputStream cargarPrestamos = new ObjectInputStream(new FileInputStream("prestamos.txt"));
            ArrayList<Prestamo> prestamosRecuperados = (ArrayList<Prestamo>) cargarPrestamos.readObject();
            cargarPrestamos.close();
            
            for(int i=0; i<prestamosRecuperados.size(); i++){
                datos.register.add(prestamosRecuperados.get(i));
            }
        }catch(Exception e){
            contador++;
            System.out.println(contador);
        }
        
        if(contador==0){
            cargado = true;
        }

        if(contador>0){
            cargado = false;
        }

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
