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
public class EJ3 {
    
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner(System.in);
         int a[],b[],c[];
         
         a=new int [10]; //Arreglo a con 10 elementos 
         b=new int [10]; //Arreglo b con 10 elementos 
         c=new int [20]; //Arreglo c contendra el arreglo a y b
         
         //Pedimos el arreglo a
         System.out.println("Digite el primer arreglo: ");
         for (int i=0;i<10;i++){
             System.out.print((i+1)+". Digite un número: ");
             a[i]=entrada.nextInt();
         }
         //Pedimos el arreglo b
         System.out.println("\nDigite el primer arreglo: ");
         for (int i=0;i<10;i++){
             System.out.print((i+1)+". Digite un número: ");
             b[i]=entrada.nextInt();             
         }
         //Ahora, vamos a mezclar los 2 arreglos en el arreglo c
         //Vamos a utilizar el iterador i para a y b 
         //Y el iterador j para el arreglo c
         int j=0;
         for (int i=0;i<10;i++){
             c[j]=a[i];//1°A, 2°A 
             j++;
             c[j]=b[i];//1°B, 2°B
             j++;
         }
         System.out.println("\nEl tercer arreglo es: ");
         for (int i=0;i<20;i++){
             System.out.print(c[i]+" ");
         }
         System.out.println();
    }
}
