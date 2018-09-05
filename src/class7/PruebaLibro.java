/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    public static void main(String[] args) {
        ConjuntoLibro biblioteca = new ConjuntoLibro(); // Relacion de Dependencia
        //Dependencia
        Autor autor1 = new Autor("Gabriel", "Garcia");
        Libro libro1= new Libro("Cien", 300, 8);
        libro1.setAutor(autor1);
        
        boolean resultado = biblioteca.anadirlibro(libro1);
        if(resultado==true){
            System.out.println("Insercion satisfactoria");
        }
        else System.out.println("problemas para insertar el libro");
        
        Autor autor2 = new Autor("Agatha", "Cristhie");
        Libro libro2 = new Libro("Cien", 300, 8);
        libro1.setAutor(autor2);
        
        resultado = biblioteca.anadirlibro(libro2);
        if(resultado==true){
            System.out.println("Insercion satisfactoria");
        }
        else System.out.println("problemas para insertar el libro");
        
        biblioteca.getLibros();
        
        System.out.println();
    }
}
