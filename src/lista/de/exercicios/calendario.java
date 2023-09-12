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
public class calendario {
    public static void main(String[] args){
       Scanner entrada= new Scanner(System.in);
         int option;
         Boolean continuar = true;
         String optionescolha;
             while (continuar){
          int jan = 30,
              fev = 28,
              mar = 30,
              abr = 30,
              mai = 30,
              jun = 30,
              jul = 30,
              ago = 30,
              set = 30,
              out = 30,
              nov = 30,
              dez = 30;
         int  mes , ano = 2023 ;
         
         System.out.println("informe o mes ");
         mes = entrada.nextInt();
         
          
           if(mes == 1){
             System.out.println("seu mes tem" + jan + " dias o ano é" + ano );
            }else if(mes == 2){
                System.out.println("seu mes tem " + fev + "dias o anno é" + ano);
            }else if (mes == 3) {
                System.out.println("seu mes tem" + mar + "dias o ano é" + ano );
            }else if (mes == 4){
                System.out.println("seu mes tem" + abr + "dias o ano é" + ano);
            }else if (mes == 5){
                System.out.println("seu mes tem" + mai + "dias o ano é" + ano);
            }else if(mes == 6){
                System.out.println("seu mes tem" + jun + "dias o ano é" + ano);
            }else if(mes == 7){
               System.out.println("seu mes tem" + jul + "dias o ano é" + ano);
            }else if (mes == 8){
               System.out.println("seu mes tem" + ago + "dias o ano é" + ano);
            }else if(mes == 9){
               System.out.println("seu mes tem" + set + "dias o ano é" + ano);
            }else if (mes == 10){
               System.out.println("seu mes tem" + out + "dias o ano é" + ano);
            }else if(mes == 11){
               System.out.println("seu mes tem" + nov + "dias o ano é" + ano);
            }else if(mes == 12){
               System.out.println("seu mes tem" + dez + "dias o ano é" + ano);
             
          
               
               
               
               
           System.out.println("you are continue ? (s/n)");
             optionescolha = entrada.next();
              
                if(optionescolha.equals("S") || optionescolha.equals("s")){
                  continuar = true;
                 }else if
                  (optionescolha.equals("N") || optionescolha.equals("n")){
                  continuar = false;
                 }
               }
            }
        }
    }
