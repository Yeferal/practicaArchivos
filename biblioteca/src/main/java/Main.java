
import java.io.IOException;
import java.text.ParseException;


        
public class Main {
    
    public static void main(String[] args) throws IOException, ParseException{
        //Write your code here 
        //ventana.ventanaEstudiantes.agregarFilaTabla(665, "yefer", 22, "adfadsfa");
        //DateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        //System.out.println(formato.format(new Date()));
        Leer_txt tx = new Leer_txt();
        //tx.CargarObjetos();
        Ventana ventana = new Ventana(tx);
        System.out.println(ventana.registros.fechaHoy());
        System.out.println(ventana.registros.diferenciaDias("2019-07-30"));
        System.out.println(ventana.registros.calcularMonto(ventana.registros.diferenciaDias("2019-07-30")));


        
        
        

        //tx.datos.verPrestamos();
        
        //tx.generarArchLibros
        
        //tx.datos.verPrestamos();
        //tx.datos.ver();
        //tx.datos.verEstudiantes();
        //tx.datos.verPrestamos();
        //tx.GuardarObjetos();
        
        
    }
}
