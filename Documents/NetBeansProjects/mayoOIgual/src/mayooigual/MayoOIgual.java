//pederi dos numeros y decir cual es mayor o si son igaules 
package mayooigual;

import javax.swing.JOptionPane;


public class MayoOIgual {

    
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para comprar:"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para comprar con el primer numero ingresado:"));
        
        if (num1>num2){
            System.out.println("El primer numero ingresado es mayor que el segundo");
        }
        else if (num1<num2){
            System.out.println("El primer numero es menor al segundo ingresado");
        
        }
        else {
            System.out.println("Los numero ingresados son iguales");
        }
    }
    
}
