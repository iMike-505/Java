/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

/**
 *
 * @author migue
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos primitivos
        float decimal = 3.141592653589793238f; //variable numerica con punto decimal
        char caracter = 'æ'; //variable de caracteres
        boolean decision = false; //verdadero o falso
        byte entero = 10; //datos de -128 a 127
        int malla = 1234567890; //de -2,147,483,648 a 2,147,483,647
        
        //Datos no primitivos y cadenas
        Integer numero = null;
        String palabras = "Hello there";

        //Constantes
        int numero1 = 30;
        final int oremun = 60;
        
          numero1 = 90;
        //oremun = 120; al tener "final" se vuelve constante y no puede cambiar su valor
        
        System.out.println("Numero Pi: "+ decimal);
        System.out.println("Ligadura: "+caracter);
        System.out.println("Lo que diras será: "+decision);
        System.out.println("¿Cuantos años tienes? "+entero);
        System.out.println("numeros del teclado: "+malla);
        
        System.out.println("su saldo es: "+numero);
        System.out.println(palabras);
        
        System.out.println("variable: "+numero1);
        System.out.println("consatnte: "+oremun);    
    }
    
}
