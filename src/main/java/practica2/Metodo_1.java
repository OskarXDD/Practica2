package practica2;

import java.util.Scanner;



public class Metodo_1 {
    
    public static int digitosPares(int entero){
        int suma=0;
        
        while(entero > 0 ){
            int x = entero%10;
            int y = x;
            
            if(y%2==0){
                suma++;
            }
            
            entero = entero/10;
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un entero");
        int entero = input.nextInt();
        
        long resultado = digitosPares(entero);
        
        System.out.println(resultado);
    }
}
