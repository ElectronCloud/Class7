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
public class ConjuntoLibro {
    private Libro[] libros; //Asociacion cardinalidad 10 (Tamano maximo conocido)
    
    public ConjuntoLibro(){
        this.libros = new Libro[10]; // Liberando la memoria maxima
    }
    
    public boolean anadirlibro(Libro libro){
        for(int i=0; i<libros.length; i++){
            if(libros[i]==null){
                this.libros[i]=libro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarxTitulo(String titulo){
        for(int i=0; i<libros.length; i++){
            if(this.libros[i]!= null && this.libros[i].getTitulo().equals(titulo)){
                this.libros[i]=null;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarxAutor(String autor){
        for(int i=0; i<libros.length; i++){
            if(this.libros[i]!= null && this.libros[i].getAutor().getNombre().equals(autor)){
                this.libros[i]=null;
                return true;
            }
        }
        return false;
    }
    
    public Libro buscarMejorCalificacion(){
        Libro mejor = null;
        for(int i=0; i<libros.length; i++){
            if(i==0 && this.libros[i]!=null){
                mejor=this.libros[i];
            }
            else{
                if(this.libros[i]!=null && this.libros[i].getCalificacion() > mejor.getCalificacion()){
                    mejor = this.libros[i];
                }
            }
        }
        return mejor;
    }
    
    public Libro buscarMenorCalificacion(){
        Libro menor = null;
        for(int i=0; i<libros.length; i++){
            if(i==0 && this.libros[i]!=null){
                menor=this.libros[i];
            }
            else{
                if(this.libros[i]!=null && this.libros[i].getCalificacion()<menor.getCalificacion()){
                    menor = this.libros[i];
                }
            }
        }
        return menor;
    }

    public Libro[] getLibros() {
        return libros;
    }
  
}
