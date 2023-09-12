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
public class calculadorasimples {
    
    public static void main(String args[]){
        //declaração da variavel do tpo escanner
        Scanner entrada = new Scanner(System.in);
        
        //declaraçao das variaveis que receberam os numeros
        int option;
        // int = declaração de variavel inteira e opção da caçculadora
        //float = declaraçao de variavel de numero quebrado = nao inteiro 
        
        float num1,num2, resultado = 0;
       
        Boolean continuar = true;
       
            String optionescolha;
       
       while(continuar){
      
        //menu da calculadora 
                System.out.println("-----------------------------------");
                System.out.println("calculadora four operetion basic");
                System.out.println("-----------------------------------");
                System.out.println("selecine um option");
                System.out.println("1 soma");
                System.out.println("2 divisao");
                System.out.println("3 mutiplication");
                System.out.println("4 subtracao");
                System.out.println("_______________________________");
            // netrada da opção
            option = entrada.nextInt();
           

           //condicionais referentes  a opção  sellecionada
            if(option == 1){//soma!!5
                 //entrada do primeiro valor  a ser calculado
              System.out.println("imforme o primeiro numero");
              num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
              num2 = entrada.nextFloat();
                resultado = num1 + num2;
            }else if(option == 2){//Subtração!!
                 //entrada do primeiro valor  a ser calculado
              System.out.println("imforme o primeiro numero");
              num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
              num2 = entrada.nextFloat();
                 resultado = num1 / num2;
            }else if(option== 3){//divisão!!
                 //entrada do primeiro valor  a ser calculado
              System.out.println("imforme o primeiro numero");
              num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
              num2 = entrada.nextFloat();
                resultado = num1 * num2; 
            }else if(option == 4){//muçtiplicão!!
                 //entrada do primeiro valor  a ser calculado
              System.out.println("imforme o primeiro numero");
              num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
              num2 = entrada.nextFloat();
                resultado = num1 - num2; 
            }else{
                System.out.println("option inexistente!");
            }
            
            System.out.println("-------------------------");
            System.out.println("resultado");
            System.out.println("----------------------");
            System.out.println(resultado);

            System.out.println("you are continue ? (s/n)");
            optionescolha = entrada.next();
              
            if(optionescolha.equals("S") || optionescolha.equals("s")){
                 continuar = true;
            }else{
               continuar = false;
            }
        }
    }
}  

