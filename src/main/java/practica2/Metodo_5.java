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
public class Metodo_5 {
    
    public static int[] chaquirasColores (int[] arreglo){
        int verde = 0;
        int rojo = 0;
        int amarillo = 0;
        int azul = 0;
        int blanco = 0;
        
        
        for(int i=0;i<arreglo.length;i++){
            switch(arreglo[i]){
                case 1 -> verde++;
                case 2 -> rojo++;
                case 3 -> amarillo++;
                case 4 -> azul++;
                case 5 -> blanco++;
            }
        }
        
        int tam = arreglo.length;
        int arregloC[] = new int[tam];
        int i=0;
        
        while(i<tam){
            if(verde > 0){
                arregloC[i++] = 1;
                verde--;
                if(verde>0 && i<tam){
                    arregloC[i++] = 1;
                    verde--;
                }
            }
            
            if(rojo > 0){
                arregloC[i++] = 2;
                rojo--;
                if(rojo>0 && i<tam){
                    arregloC[i++] = 2;
                    rojo--;
                }
            }
            
            if(amarillo > 0){
                arregloC[i++] = 3;
                amarillo--;
                if(amarillo>0 && i<tam){
                    arregloC[i++] = 3;
                    amarillo--;
                }
            }
            
            if(azul > 0){
                arregloC[i++] = 4;
                azul--;
                if(azul>0 && i<tam){
                    arregloC[i++] = 4;
                    azul--;
                }
            }
            
            if(blanco > 0){
                arregloC[i++] = 5;
                blanco--;   
                if(blanco>0 && i<tam){
                    arregloC[i++] = 5;
                    blanco--;
                }
            }
        }
        
        return arregloC;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa de que tamaño quieres el arreglo");
        int tam = input.nextInt();
        
        int[] arreglo = new int[tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("Ingresa una valor");
            arreglo[i] = input.nextInt();
        }
        
        int[] resultado = chaquirasColores(arreglo);
        for(int i=0;i<resultado.length;i++){
            System.out.print(resultado[i] + " ");
        }
    }
}
