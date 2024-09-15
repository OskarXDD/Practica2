/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Metodo_4 {
    
    public static int localizarFlotante(float[] arreglo, float x){
        int suma = 0;
        
        for(int i=0;i < arreglo.length;i++){
            if(x == arreglo[i]){
                suma++;
            }
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa de que tamaño quieres el arreglo");
        int tam = input.nextInt();
        
        float[] arreglo = new float[tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("Ingresa una valor");
            arreglo[i] = input.nextFloat();
        }
        
        System.out.println("Ingresa un flotante a localizar");
        float x = input.nextFloat();
        
        int resultado = localizarFlotante(arreglo,x);
        
        System.out.println(resultado);
    }
}
