
package nota;

import java.util.Scanner;
/*pedir una nota del 0 al 10 y mostrarla de la forma:
insuficiente, suficiente,bien,notable,sobresaliente
*/

public class Nota {

    
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int nota;
        System.out.println("Ingrese la nota: ");
        nota = teclado.nextInt();
        //nota = Interger.parseInt(JOptionPane.showInputDialog("Ingrese la nota")); 
        
        if (nota>0 && nota <=5){
            //JOptionPane.showMessageDialog(null, "la nota "+nota+" es insuficiente");
            System.out.println("la nota "+nota+" es insuficiente");
                    }
        else if (nota == 6){
            //JOptionPane.showMessageDialog(null, "la nota "+nota+" es Suficiente");
            System.out.println("la nota "+nota+" es suficiente");
        }
        else if (nota == 7){
        //JOptionPane.showMessageDialog(null, "la nota "+nota+" esta bien");
            System.out.println("la nota "+nota+" esta bien");
        }
        else if (nota ==8){
        //JOptionPane.showMessageDialog(null, "la nota "+nota+" es notable");
            System.out.println("la nota " +nota+ " es notable");
        }
        else if (nota >=9 && nota <=10){
        //JOptionPane.showMessageDialog(null, "la nota "+nota+" es notable");
            System.out.println("la nota "+nota+" es sobresaliente");
        }
        else {
        //JOptionPane.showMessageDialog(null,"se ha equivocado al ingresar la nota, la nota infresada fue: "+nota);
            System.out.println("se ha equivocado al ingresar la nota, la nota infresada fue: "+nota);
        }
        
    }
    
}
