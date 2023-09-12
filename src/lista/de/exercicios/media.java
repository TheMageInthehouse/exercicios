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
public class media {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
         int num1, num2,num3 , resultado;
         
         System.out.println("informe o primeiro numero : ");
         num1 = entrada.nextInt();
         System.out.println("informe seu segundo numero; ");
         num2 = entrada.nextInt();
         System.out.println("informe seu terceiro numero: ");
         num3 = entrada.nextInt();
        resultado =( num1 + num2 + num3)/ 3 ;
        System.out.println("a media:" + num1 + "e" + num2 + "e" + num3 + " é " + resultado );
         
        
         
         
                    
    }
}
