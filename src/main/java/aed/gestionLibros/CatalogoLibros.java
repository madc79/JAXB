package aed.gestionLibros;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CatalogoLibros {
    
    ArrayList<Libro> catalogo = new ArrayList<Libro>();
    
    public void agregarLibro () {
        
        Scanner scanner = new Scanner (System.in);
        Libro libroNuevo = new Libro ();
        
        System.out.println("Título: ");
        libroNuevo.setTitulo(scanner.nextLine());
        
        System.out.println("Autor ");
        libroNuevo.setAutor(scanner.nextLine());
        
        System.out.println("Año: ");
        libroNuevo.setFecha(scanner.nextInt());
        
        System.out.println("Género: ");
        libroNuevo.setGenero(scanner.nextLine());
        
        System.out.println("Libro añadido");
        System.out.println("Título: " + libroNuevo.getTitulo());
        System.out.println("Autor: " + libroNuevo.getAutor());
        System.out.println("Año: " + libroNuevo.getFecha());
        System.out.println("Género: " + libroNuevo.getGenero());
   
    }
    
    public void eliminarLibro () {
        
    }
    
    public void listarLibros () {
        
    }
    
    public void guardarCatalogo () {
        
         try {

            // Crear un objeto Employee

            Libro employee = new Libro();

            Libro.setI(101);

            Libro.setName("John Doe");

            Libro.setRole("Developer");

            Libro.setSalary(50000);

 

            // Crear el contexto de JAXB para la clase Employee

            JAXBContext context = JAXBContext.newInstance(Employee.class);

 

            // Crear el Marshaller para convertir el objeto en XML

            Marshaller marshaller = context.createMarshaller();

 

            // Formatear el XML con sangrías

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

 

            // Guardar el objeto Employee como XML en un archivo

            marshaller.marshal(employee, new File("employee.xml"));

 

            System.out.println("Archivo XML creado exitosamente: employee.xml");

 

        } catch (JAXBException e) {

            e.printStackTrace();

        }
        
    }
    
    public void cargarCatalogo () {
        
    }

       /* try { 

            Libro libro = new Libro();

            libro.setAutor("");

            libro.setTitulo("");

            libro.setFecha(2001);

            libro.setGenero("");
            
            
            // Crear el Marshaller para convertir el objeto en XML
            JAXBContext context = JAXBContext.newInstance(Libro.class);
            
            Marshaller marshaller = context.createMarshaller();

            */

           
    
    
}
