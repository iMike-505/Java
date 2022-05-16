/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

 import java.util.Scanner;

/**
 *
 * @author migue
 */
public class OperadoresAritmeticos {
      //Operadores Aritmeticos combinados con asignacion 
    public static void main(String[] args){
        int numero = 10;
        
        numero %= 5;
        
        numero += 5;
        
        System.out.println(numero);
        
    }
}
