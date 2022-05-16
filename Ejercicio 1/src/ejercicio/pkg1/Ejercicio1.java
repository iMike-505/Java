/*
Ejercicio 1:
    Hacer un programa el cual calcule e imprima la suma de 
    tres calificaciones
 */
package ejercicio.pkg1;

import java.util.Scanner;

 public class Ejercicio1 {
     
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         float nota1,nota2,nota3,suma;
         
         //guardando las 3 notas
         System.out.println("Digite 3 calificaciones: ");
         nota1 = entrada.nextFloat();
         nota2 = entrada.nextFloat();
         nota3 = entrada.nextFloat();
         
         suma = nota1+nota2+nota3; //sumando las tres calificaciones
         
         
         System.out.println("\nLa suma es: "+suma);
         
         
     }
}
