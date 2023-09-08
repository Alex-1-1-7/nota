
package tablamul300823;
import java.util.Scanner;
public class Tablamul300823 {

    public static void main(String[] args) {
        
    /*int [] tabla = {1,2,3,4,5,6,7,8,9};
     Scanner teclado = new Scanner (System.in);
     
     int num, resultado, i=0;
        System.out.println("ingrese un numero para multiplicar");
    num = teclado.nextInt();
     
    while (i<tabla.length){
    resultado = num * tabla[i];
    
        System.out.println(num + "x"+ tabla [i] + "="+ resultado);
           i++;
            }*/
    
        System.out.println("..tabla ya hecha por mi..");
            Scanner teclado = new Scanner (System.in);
        int num1,num2=1, resul;
        System.out.println("escriba la tabla de multiplicar que quiera: ");
        num1 = teclado.nextInt();
        
         System.out.println("tabala de multiplicar del: "+ num1);
        while (num2 <=10){
            resul = num2 * num1;
            System.out.println( num2 + "x" + num1 + "=" + resul );
            num2++;
            
        }
        
    }
    
}
