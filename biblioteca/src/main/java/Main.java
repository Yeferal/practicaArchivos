
import java.io.IOException;
import java.text.ParseException;


        
public class Main {
    
    public static void main(String[] args) throws IOException, ParseException{
        //Write your code here 
        //ventana.ventanaEstudiantes.agregarFilaTabla(665, "yefer", 22, "adfadsfa");
        //DateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        //System.out.println(formato.format(new Date()));
        Leer_txt tx = new Leer_txt();
        //System.out.println(tx.registros.buscarEstudiante(200812345));
        //System.out.println(tx.registros.buscarLibro("101-AAA"));
        //System.out.println("Diferencia: "+tx.registros.diferenciaDias("2019-03-25"));
        //tx.CargarObjetos();
        Ventana ventana = new Ventana(tx);
        //tx.datos.verPrestamos();
        
        //tx.generarArchLibros
        
        //tx.datos.verPrestamos();
        //tx.datos.ver();
        //tx.datos.verEstudiantes();
        //tx.datos.verPrestamos();
        //tx.GuardarObjetos();
        
        
    }
}
