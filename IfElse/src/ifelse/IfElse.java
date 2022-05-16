/* La sentencia if:

   if (condicion){
       Instruccion;

    }
    else{
        instruccion2;
    }

*/

package ifelse;

import javax.swing.JOptionPane;

public class IfElse {
     

    public static void main(String[] args) {
       int numero, dato = 5;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite una cifra: "));
   
       if (numero == dato){
          JOptionPane.showMessageDialog(null, "El numero es 5");  
        }
        else{
           JOptionPane.showMessageDialog(null, "El numero es diferente de 5 ");
        }
 
    }
 
}
