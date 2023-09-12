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
public class parouimpar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Boolean continuar =  true ;
      
        String optionescolha;
      
        int valor;
        
        while (continuar){
            System.out.println("imforme o numero ");
            valor  = entrada.nextInt();
       
            if(valor % 2 == 0 ){
               System.out.println("par");
            }else if(valor % 2 == 1){
               System.out.println("impar"); 
            }
     
            System.out.println("quer cintinuar");
            optionescolha = entrada.next();
       
            if(optionescolha.equals("S") || optionescolha.equals("s")){
                continuar = true;
            }else if(optionescolha.equals("N") || optionescolha.equals("n")){
                continuar = false; 
            }
        }
    }
}


