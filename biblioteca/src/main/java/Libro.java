


/**
 *
 * @author yefer
 */
public class Libro {
    
    String titulo;
    String autor;
    String codigo;
    int cantidad;
    String fechaPublicacion;
    String editorial;
    
    public Libro(String titulo, String autor, String codigo, int cantidad){
        this.titulo=titulo;
        this.autor=autor;
        this.codigo=codigo;
        this.cantidad=cantidad;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
}
