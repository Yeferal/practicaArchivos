
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
        for(int i=0; i<ventana.arregloEstudiantes().size(); i++){
            System.out.println(ventana.arregloEstudiantes().get(i).getCarnet());
            System.out.println(ventana.arregloEstudiantes().get(i).getLimite());
        }
        
        for (int i=0; i<ventana.arregloPrestamos().size(); i++) {
            System.out.println(ventana.arregloPrestamos().get(i).getCarnetE());
            System.out.println(ventana.arregloPrestamos().get(i).getCantidad());
        }
        

        //tx.datos.verPrestamos();
        
        //tx.generarArchLibros
        
        //tx.datos.verPrestamos();
        //tx.datos.ver();
        //tx.datos.verEstudiantes();
        //tx.datos.verPrestamos();
        //tx.GuardarObjetos();
        
        
    }
}
