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
public class tabuada {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        String optiontaubada;
        
        int tab,resultado,cont = 1 ;
        System.out.println("imforme a tauada");
        tab = entrada.nextInt();
         while (cont<= 10){
         resultado = tab * cont;
         
         System.out.println(tab + "x" + cont +  " = " + resultado);
         cont = cont + 1;
         
        
        
         } 
    }
 }
