/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Oscar
 */

    class Imagen{
            private int renglones;
            private int columnas;
            private int pixeles[];

            public Imagen(int renglones, int columnas, int[] pixeles) {
                this.renglones = renglones;
                this.columnas = columnas;
                this.pixeles = pixeles;
            }

            public int[] getPixeles(){
                return pixeles;
            }
        }

public class Metodo_6 {
        public static int[] obtenerColores(Imagen imagen){
            int[] pixeles = imagen.getPixeles();
            
            Set<Integer> coloresUnicos = new HashSet<>(); 
            
            for (int pixel : pixeles) {
                coloresUnicos.add(pixel);  
            }
            
            int[] coloresArray = new int[coloresUnicos.size()];
            int i = 0;
            for (int color : coloresUnicos) {
                coloresArray[i++] = color;
            }
            
            return coloresArray;

        }
        
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingresa el numero de renglones");
            int renglones = input.nextInt();
            System.out.println("Ingresa el numero de columnas");
            int columnas = input.nextInt();
            
            int totalPixeles = renglones * columnas;
            int[] pixeles = new int[totalPixeles];
            
            for (int i = 0; i < totalPixeles; i++) {
                System.out.printf("Introduce un color en hexadecimal: ", i + 1);
                pixeles[i] = input.nextInt(16);  
            }
            
            Imagen imagen = new Imagen(renglones,columnas,pixeles);
            
            int[] coloresUnicos = obtenerColores(imagen);

            System.out.println("Colores unicos en la imagen:");
            for (int color : coloresUnicos) {
                System.out.printf("#%06X ", color);  
            }
        }
    }

