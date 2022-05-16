/**Hacer un programa que simule un cajero automatico
con un saldo inicial de 1000 dolares, con las siguientes opciones

1.- ingresar dinero
2.- retirar dinero
3.- salir
*/
package cajero;

  import javax.swing.JOptionPane;

  public class Cajero {

    
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion; 
        float ingreso, saldoActual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n"
                + "1.- Depositar dinero\n"
                + "2.- Retirar dindero\n"
                + "3.- Salir"));
        
        switch(opcion){
            case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar: "));
                    saldoActual = saldo_inicial + ingreso;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual );
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad que desee retirar" ));         
                    
                if(retiro>saldo_inicial){
                  JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente...");                                      
                }
                else{
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta" +saldoActual );
                }
                     break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion...");
                    break;
        }
       
    }
    
}
