/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;


public class Metodo_2 {
    
    public static boolean validaPalindromo(String frase){
        frase=frase.replaceAll(" ","");
        frase=frase.toLowerCase();
        String reversa = "";
        
        for (int i = frase.length()-1; i>=0; i--)
               reversa+= frase.charAt(i);
        if(reversa.equals(frase)) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa una frase");
        String frase = input.nextLine();
        
        if(Metodo_2.validaPalindromo(frase)){
            System.out.println("Palindromo");
        } else System.out.println("No es palindromo");
    }
}
