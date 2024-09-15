
package practica2;

import java.util.Scanner;


public class Metodo_3 {
    
    public static boolean validaCapicua(int entero){
        int numInv = 0;
        int num = entero;
        
        while(entero!=0){
            numInv = 10*numInv + entero % 10;
            entero = entero/10;
        }
        
        if(numInv==num) {
            return true;
        } else return false;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un entero");
        int entero = input.nextInt();
        
        boolean resultado = validaCapicua(entero);
        
        System.out.println(resultado);
    }
}
