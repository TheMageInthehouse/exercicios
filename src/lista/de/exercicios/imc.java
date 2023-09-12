/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios;

import java.util.Scanner;

/**
 *
 * @author vicentin.7910
 */
public class imc {

    /**
     *
     * @param args
     */
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
   
    
        float peso, altura,resultado , temp , altura1;
     
        System.out.println("informe seu peso ");
         peso = entrada.nextFloat();
        System.out.println("informe sua altura");
         altura = entrada.nextFloat();
        System.out.println();
         altura1 = altura * altura;
          temp = altura1;
         System.out.println();
          resultado = peso / temp ; 
     
     
        System.out.println("resultado " + resultado);
      
   }    
}
