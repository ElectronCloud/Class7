/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student(); // Dependencia
        LibraryCard card1 = new LibraryCard(); //DEpendencia
        card1.setOwner(student);
    }
}
