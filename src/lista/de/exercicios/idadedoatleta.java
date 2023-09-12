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
public class idadedoatleta {
    public static void main(String[] args){
     Scanner entrada = new Scanner (System.in);
     
     int idade, nome ;
   
   
     
     System.out.println("informe a idade ");
     idade = entrada.nextInt();
     if (idade <5){
    }else if((idade >=5 )&& (idade)<=7){
    System.out.println( " se encaixa na catedoria infantil A");
    }else if((idade >= 8) &&(idade) <= 10){
    System.out.println( "se encaixa na categoria infantil b");
    }else if((idade>=11) && (idade) <=13){
    System.out.println( "se encaixa na categoria juvenial a");
    }else if (idade>=14 && idade <=17){
     System.out.println("se encaixa na categoria juvenil b");
    }else if(idade>=18){
     System.out.println( "se encaixa na categoria adulto ");   
    }
     
     
     
     
             
     
    }
}
