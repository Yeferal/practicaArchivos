
import java.util.ArrayList;


/**
 *
 * @author yefer
 */
public class registro {
    
    int codigos;
    String code;
    Prestamo presta;
    Leer_txt tex;
    ArrayList<Prestamo> register= new ArrayList<Prestamo>();
    
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
        presta= new Prestamo(tex.datos.estudiantes.get(posocion), tex.datos.libros.get(libro), "");
        presta.estudiante.limite++;
        presta.libro.cantidad--;
        register.add(presta);
    }
}
