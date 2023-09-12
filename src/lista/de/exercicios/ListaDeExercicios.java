
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.de.exercicios;

import java.util.Scanner;

/**
 *
 * @author vicentin.7910
 */
public class ListaDeExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
       int num1,num2 ,resultado;
       
        System.out.println("imfrome o primeiro numero");
        num1 = entrada.nextInt();
        System.out.println("imforme seu segundo numero");
        num2 = entrada.nextInt();
        resultado = num1 + num2 ;
        System.out.println("resultado: " + num1 + " e " + num2 + " e: " + resultado );
        
    }
   
  }
