/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author migue
 */
public class Ventanas {
    
       
    public static void main(String[] args) {
       
        //Entrada y salida de datos (por consola)
        Scanner entrada = new Scanner(System.in);
        float numero;
     
         System.out.println("Escriba un numero");  
         numero = entrada.nextInt();
         System.out.println("El numero que escribiras es: "+numero);
         
         
        //Entrada y salida de datos por JOptionPane (ventanas emergentes)
        String cadena;
        int entero2;
        char letra2;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra2 = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es: "+entero2);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra2);
        JOptionPane.showInternalMessageDialog(null,"El numero decimal es: "+decimal);
        
        
    
  }
}

