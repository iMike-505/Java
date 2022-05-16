/*
 Construir un programa que calcule y muestre por pantallas
las raices de la ecuacion de segundo grado de coeficientes reales
 */
package ejercicio.pkg4;
 
   import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        String primero, segundo, tercero;
        double a, b, c, x1, x2;
        
        primero = JOptionPane.showInputDialog("Digite el valor de a:" );
        segundo = JOptionPane.showInputDialog("Digite el valor de b: " );
        tercero = JOptionPane.showInputDialog("Digite el valor de c: " );
        
        a=Double.parseDouble(primero);
        b=Double.parseDouble(segundo);
        c=Double.parseDouble(tercero);
        
        x1 = (double)((-1*b) + Math.sqrt((b*b) - (4*a*c))) / (2*a);
        x2 = (double)((-1*b) - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        
        JOptionPane.showMessageDialog(null, "El valor de x1 es: "+x1);
        JOptionPane.showMessageDialog(null, "El valor de x2 es: "+x2);
    
    }   
    
}
