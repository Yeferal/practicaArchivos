
import java.io.IOException;


        
public class Main {
    
    public static void main(String[] args) throws IOException{
        //Write your code here 
        //ventana.ventanaEstudiantes.agregarFilaTabla(665, "yefer", 22, "adfadsfa");
        //DateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        //System.out.println(formato.format(new Date()));
        Leer_txt tx = new Leer_txt();
        tx.CargarObjetos();
        Ventana ventana = new Ventana(tx);
        //tx.datos.verPrestamos();
        
        //tx.generarArchLibros
        
        //tx.datos.verPrestamos();
        tx.datos.ver();
        tx.datos.verEstudiantes();
        tx.datos.verPrestamos();
        //tx.GuardarObjetos();
        
        
    }
}
