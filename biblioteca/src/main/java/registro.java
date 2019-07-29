
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author yefer
 */
public class registro {
    
    int codigos;
    int numeroPago;
    String code;
    Prestamo presta;
    Leer_txt tex;
    
    
    /*
    constructor
    */
    public registro(Leer_txt tex){
        this.tex = tex;
        
    }
    /*yefer
    Verifica si puede prestar libros el estudiante si si luego busca la 
    existencia del libro que se quiere si este existe entonces invia por 
    parametro las posicion del libro y estudiante al metod que verifica
    si hay libros disponibles
    */
    public void verificacion(int respuesta){
        if(tex.datos.estudiantes.get(respuesta).verificacion()){
            if(buscarLibro(code)){
                verificacionExistencia(codigos,respuesta);
            }
            
        }else{
            System.out.println("no puede hacer prestamos");
        }
    }
    /*Yefer
    Resive por los parametros de la posicion del libro y estudiante
    si hay libros disponibles se envian los posiciones a el metod registro 
    el cual genera el prestamos que se quiere realizar ya antes confirmado
    */
    public void verificacionExistencia(int posLibro,int posEstudiante){
        if(tex.datos.libros.get(posLibro).cantidad>0){
            registro(posEstudiante, posLibro);
        }else{
            System.out.println("No existe libro");
        }
    }
    /*Yefer
    busca la existencia del estudiante en el registro comparando el carnet
    y lo envia a la verificacion de prestamos
    */
    public boolean buscarEstudiante(int carnet){
        for (int i = 0; i < tex.datos.estudiantes.size(); i++) {
            if(tex.datos.estudiantes.get(i).carnet==carnet){
                verificacion(i);
                return true;
            }
        }
        return false;
        
    }
    /*yefer
    busca la posicion del libro en existencia
    */
    public boolean buscarLibro(String codigo){
                for (int i = 0; i < tex.datos.libros.size(); i++) {
            if(tex.datos.libros.get(i).codigo==codigo){
                codigos=i;
                return true;
            }
        }
                return false;
    }
    /*Yefer
    Realiza el registro, y le resta uno al libro disponible y suma 1 al limite
    del estudiante, por ultimo agrega el registro al arreglo de prestamos
    */
    public void registro(int posocion,int libro){
        presta= new Prestamo(tex.datos.estudiantes.get(posocion).carnet, tex.datos.libros.get(libro).codigo, "");
        presta.presto();
        
        tex.datos.register.add(presta);
    }
    
    public void devolucion(){
        
    }
    public boolean buscarPrestamos(int carne, String code){
        for (int i = 0; i < tex.datos.register.size(); i++) {
            if(tex.datos.register.get(i).estudiante.carnet==carne && tex.datos.register.get(i).libro.codigo==code && tex.datos.register.get(i).estado){
                //agregamos al pago y cambia los prestamos del mismo
                numeroPago=i;
                return true;
            }else{}
        }
        return false;
    }
        
    public void pagar(int carne, String code){
        if(buscarPrestamos(carne, code)){
            //Se confirma el regreso del libro
            tex.datos.register.get(numeroPago).regreso();
        }else{
            System.out.println("NO existe el registro para poder pagar");
        }
    }
    
    
//    public void ordenarCarnet(){
//        Estudiante aux;
//        for (int i = 0; i < (tex.datos.estudiantes.size()-1); i++) {
//            for (int j = 0; j < (tex.datos.estudiantes.size()-1); j++) {
//                if(tex.datos.estudiantes.get(j).carnet>tex.datos.estudiantes.get(j+1).carnet){
//                    aux=tex.datos.estudiantes.get(j);
//                    tex.datos.estudiantes.set(j,tex.datos.estudiantes.get(j+1));
//                    tex.datos.estudiantes.set(j+1,aux);
//                }
//            }
//        }
//    }
//    public void ordenarCarnetAscendente(){
//        for (int i = 0; i < (tex.datos.estudiantes.size()-1); i++) {
//
//            //Se aniade la informacion en este orden a la tabla
//                
//        }
//    }  
//        
//    public void ordenarCarnetDescendente(){
//        for (int i = (tex.datos.estudiantes.size()-1); i >= 0; i--) {
//
//            //Se aniade la informacion en este orden a la tabla
//                
//        }
//    }

//    public void ordenarLibros(){
//                Libro aux;
//        for (int i = 0; i < (tex.datos.libros.size()-1); i++) {
//            for (int j = 0; j < (tex.datos.libros.size()-1); j++) {
//                if(Integer.parseInt((tex.datos.libros.get(j).codigo).substring(0,2))>Integer.parseInt((tex.datos.libros.get(j+1).codigo).substring(0,2))){
//                    aux=tex.datos.libros.get(j);
//                    tex.datos.libros.set(j,tex.datos.libros.get(j+1));
//                    tex.datos.libros.set(j+1,aux);
//                }
//            }
//        }
////        tex.datos.libros.sort(code);
//    }
//    public void ordenarLibrosAscendente(){
//        for (int i = 0; i < (tex.datos.libros.size()-1); i++) {
//
//            //Se aniade la informacion en este orden a la tabla
//                
//        }
//    }
//        
//    public void ordenarLibrosDescendente(){
//        for (int i = (tex.datos.libros.size()-1); i >= 0; i--) {
//
//            //Se aniade la informacion en este orden a la tabla
//                
//        }
//    }
    
    
}
