/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[5];
        /*
        Declarar un arreglo con los espacios en blanco por defecto
        */
        
        // arreglo de tipo entero
        int[] arreglo2;
        arreglo2 = new int[5];
        /*
        Declarar un arreglo igual que el anterior pero en dos pasos
        */
        
        // arreglo de tipo entero
        int[] arreglo3 = {5, 10, 15, 20, 25}; // sin new
        /*
        Asignarle directamente los valores al arreglo
        */
        
        // arreglo de doubles - 3 elementos
        double[] arreglo4 = {5.1, 10.2, 15.2}; // sin new
        
        // arreglo de cadenas - 4 elementos
        String[] arreglo5 = {"Loja", "Quito", "Zamora", "Machala"};
    }

}
