package aed.gestionLibros;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;

public class Libro {
    
    private String titulo;
    private String autor;
    private int fecha;
    private String genero;
    
    public Libro (){}
    
    @XmlElement

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @XmlElement

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @XmlElement

      public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @XmlElement
    
     public String getGenero() {
        return genero;
    }

    public int getFecha() {
        return fecha;
    } 
    
    @Override

    public String toString() {

        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Fecha " + fecha + ", Género: " + genero + "]";

    }
    
}