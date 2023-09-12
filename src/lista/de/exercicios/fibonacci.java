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
public class fibonacci {
    public static void main (String[] args){
     Scanner entrada = new Scanner(System.in);
     System.out.println("informe a quantidade de numeros");
     int qtd = entrada.nextInt();
     int n1 = 1;
     int n2  = 1;
     System.out.print("1");
     System.out.print("1");
     qtd = qtd - 2;
     while (qtd > 0 ){
     System.out.print((n1+n2)+" ");
     int n3 = n1 + n2;
     n1 = n2;
     n2 = n3;
      qtd--;
      
     }
     System.out.println("fim");
    }
}
