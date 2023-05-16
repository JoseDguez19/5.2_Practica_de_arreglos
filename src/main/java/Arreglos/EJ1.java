/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class EJ1 {
    
        public static void main(String[] args) {
    
        Scanner entrada= new Scanner(System.in);
        float [] numeros= new float [5];
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i]=entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }
    }   
}
