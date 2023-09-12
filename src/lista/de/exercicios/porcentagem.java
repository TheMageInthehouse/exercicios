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
public class porcentagem {
    public static void main(String[] args){
     Scanner entrada = new Scanner (System.in);
      int num1;
      float porcentagem = 0,resultado;
      
      System.out.println("Digite o numero:  ");
      num1 = entrada.nextInt();
      
      System.out.println("imforme a porcentagem");
      porcentagem = entrada.nextFloat();
      
      System.out.println();
       resultado =(num1*porcentagem)/ 100 ;
       
       System.out.println("o resultado " + resultado);
     
    }
}
