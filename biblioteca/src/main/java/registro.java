
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    Ventana ventana;
    
    
    /*
    constructor
    */
    public registro(Leer_txt tex, Ventana ventana){
        this.tex = tex;
        this.ventana = ventana;
        
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
                //erificacionExistencia(codigos,respuesta);
            }
            
        }else{
            System.out.println("no puede hacer prestamos");
        }
    }

    /**
     * Verifica que existan unidades del libro consultado, si no devuelve cero.
     * @param codigo 
     */ 
    public int LibrosEnexistencia(String codigo){
        int existencias = 0;
        if(buscarLibro(codigo)){
            ventana.cargarLibros(codigo);
            existencias = ventana.tmpL.getCantidad();
        }
        if(existencias>0){
            return existencias;
        }else{
            return 0;
        }       
    }
    
    /*Yefer
    busca la existencia del estudiante en el registro comparando el carnet
    y lo envia a la verificacion de prestamos
    */
    
    public boolean buscarEstudiante(int carnet){
        File archivo = new File("estudiantes/"+carnet+".bin");
        if(archivo.exists()){
            return true;
        }else{
            return false;
        }
    }
    /*yefer
    busca la posicion del libro en existencia
    */
    public boolean buscarLibro(String codigo){
        File archivo = new File("libros/"+codigo+".bin");
        if(archivo.exists()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean buscarRegistro(String codigo, int carnet){
        File archivo = new File("prestamos/"+codigo+carnet+".bin");
        if(archivo.exists()){
            return true;
        }else{
            return false;
        }
    }
    
    /*Yefer
    Realiza el registro, y le resta uno al libro disponible y suma 1 al limite
    del estudiante, por ultimo agrega el registro al arreglo de prestamos
    */
    public void registro(int posocion,int libro){
        presta= new Prestamo(tex.datos.estudiantes.get(posocion).carnet, tex.datos.libros.get(libro).codigo, "");
        
        //presta.presto();
        //Metodo para reducir el libro que prestó y aumentar la cantidad de prestamos al estudiante
        
        tex.datos.register.add(presta);
    }
    public int diferenciaDias11(String date, boolean mora) throws ParseException{
        
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");//se establece el formato
        //String date = "2019-07-31";//string con la fecha
        int dia = fecha.parse(date).getDate();//obtener el dia del mes
        int mes = fecha.parse(date).getMonth()+1;//Obtener el mes del año, se suma 1, porque lee de 0 a 11
        int year = fecha.parse(date).getYear()+ 1900;//Obtener el año, lee desde 1900
    
        Calendar hoy = Calendar.getInstance();//Fecha hoy
        int tdy = hoy.get(Calendar.DAY_OF_YEAR);//Obtener dia del año de hoy
        Calendar calendario = Calendar.getInstance();
        calendario.set(year, mes-1, dia);//Fecha del String, se resta 1 a mes por que java lee de 0 a 11
        int day = calendario.get(Calendar.DAY_OF_YEAR);//Dia del año del string
        int dias = day - tdy+1;//calcula la diferencia de dias
        if(dias<0 && !mora){
            dias=-dias;
        }
    
        return dias;
    }
            
    public void devolucion(){
        
    }
    public boolean buscarPrestamos(int carne, String code){
        for (int i = 0; i < tex.datos.register.size(); i++) {
            if(tex.datos.register.get(i).carnetE==carne && tex.datos.register.get(i).codigoL==code && tex.datos.register.get(i).estado){
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
            //tex.datos.register.get(numeroPago).regreso();
            //Agregar metodo para aumentar la cantidad de libros, según el que regreso y reducir la cantidad de
            //prestamos del estudiante
        }else{
            System.out.println("NO existe el registro para poder pagar");
        }
    }
    
    /**
     * Metodo que devuelve la diferencia de dias entre la fecha actual y una que es enviada 
     * como String
     * @param date
     * @return 
     * @throws java.text.ParseException 
     */
    public int diferenciaDias(String date) throws ParseException{
        
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");//se establece el formato
        //String date = "2019-07-31";//string con la fecha
        int dia = fecha.parse(date).getDate();//obtener el dia del mes
        int mes = fecha.parse(date).getMonth()+1;//Obtener el mes del año, se suma 1, porque lee de 0 a 11
        int year = fecha.parse(date).getYear()+ 1900;//Obtener el año, lee desde 1900
    
        Calendar hoy = Calendar.getInstance();//Fecha hoy
        int tdy = hoy.get(Calendar.DAY_OF_YEAR);//Obtener dia del año de hoy
        Calendar calendario = Calendar.getInstance();
        calendario.set(year, mes-1, dia);//Fecha del String, se resta 1 a mes por que java lee de 0 a 11
        int day = calendario.get(Calendar.DAY_OF_YEAR);//Dia del año del string
        int dias = tdy - day + 1;//calcula la diferencia de dias
        if(dias<0){
            dias=-dias;
        }
    
        return dias;
    }
    
    public String fechaHoy(){
        
        Calendar hoy = Calendar.getInstance();
        int day = hoy.get(Calendar.DAY_OF_MONTH);
        int month = hoy.get(Calendar.MONTH)+1;
        int year = hoy.get(Calendar.YEAR);
        String fecha = year+"-"+month+"-"+day;
        if(day<=9 && month<=9){
            fecha = year+"-0"+month+"-0"+day;
        }
        if(day<=9 && month>9){
            fecha = year+"-"+month+"-0"+day;
        }
        if(day>9 && month<=9){
            fecha = year+"-0"+month+"-"+day;
        }
        
        return fecha;
    }
    
    public int calcularMonto(int dias){
        int monto;
        if(dias<=3){
            monto = 5*dias;
            return monto;
        }else{
            monto = 15 + 10*(dias-3);
            return monto;
        }
    }
   
    
}
