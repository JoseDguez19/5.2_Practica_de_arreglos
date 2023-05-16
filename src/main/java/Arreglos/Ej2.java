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
public class Ej2 {
    
     public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        float numeros[]= new float[5];
        float suma_positivos = 0, suma_negativos=0, media_positivos, media_negativos;
        int conteo_positivos=0, conteo_negativos=0, conteo_ceros=0;
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i]=entrada.nextFloat(); 
            if(numeros[i]==0){
             conteo_ceros++;
            }
            else if (numeros[i]>0){
             suma_positivos += numeros[i];
             conteo_positivos++;
            }
            else{
             suma_negativos += numeros[i];
             conteo_negativos++;
            }           
        }
        //Media de los números positivos
        if (conteo_positivos==0){
            System.out.println("No se puede sacar la media de los números positivos");
        }
        else{
            media_positivos= suma_positivos/conteo_positivos;
            System.out.println("La media de los números positivos es: "+media_positivos);
        }
        //Media de los números negativos
        if (conteo_negativos==0){
            System.out.println("No se puede sacar la media de los números negativos");
        }
        else{
            media_negativos= suma_negativos/conteo_negativos;
            System.out.println("La media de los números positivos es: "+media_negativos);
        }
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
}
