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
public class trocadevariaveis {
 public static void main (String[] args){
   Scanner entrada = new Scanner (System.in);
   
    int num1,num2, temp = 0;
      
    
     System.out.println("informe o primeiro numero");
       num1 = entrada.nextInt();
     System.out.println("informe o segundo numero");
       num2 = entrada.nextInt();
     
    
      System.out.println();
       temp = num1 ;
    
      System.out.println(); 
       num1 = num2 ;
    
      System.out.println();
        num2 = temp ;
    
    
     System.out.println("os valores sao " + num1);
     System.out.println("os valores sao" + num2);
     
 }
}
