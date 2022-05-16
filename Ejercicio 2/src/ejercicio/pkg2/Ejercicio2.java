/*
 La calificacion final de un estudiante de informatica se calcula con base
 a las calificaciones de 4  aspectos de su rendimiento academico:
 -participación 
 -primer examen parcial
 -segundo examen parcial
 -examen final
Sabiendo que las calificaciones anteriores entran a la calificacion final con 
ponderaciones del 10%, 25%, 25% y 40%.
Hacer un programa el cual calcule e imprima la calificacion finale obtenida por
un estudiante
 */
package ejercicio.pkg2;

import java.util.Scanner;

 public class Ejercicio2 {
   
     public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
         
         //pedir los datos necesarioss
         System.out.println("Digite la participacion: ");
         participacion = entrada.nextFloat();
         System.out.println("Digite la primera nota del examen parcial: ");
         primerExamen = entrada.nextFloat();
         System.out.println("Digite la nota del segundo examen parcial: ");
         segundoExamen = entrada.nextFloat();
         System.out.println("Digite la nota del examen final: ");
         examenFinal = entrada.nextFloat();
         
         participacion *= 0.10f;
         primerExamen *= 0.25f;
         segundoExamen *= 0.25f;
         examenFinal *= 0.40f;
         
         //suma de las notas
         notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
         
         //iomprimir el resultado
         System.out.println("\nLa nota final es: "+notaFinal);
         
         
     }
}
