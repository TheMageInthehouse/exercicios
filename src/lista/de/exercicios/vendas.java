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
public class vendas {
    public static void main(String[] args){
     
        Scanner entrada = new Scanner (System.in);
     
        String produto1 = "cooler";
        String produto2 = "gabinete";
        String produto3 = "teclado";
        String produto4 = "mouse";
        String produto5 = "monitor";
       float preço1 =(float) 269.00;
       float preço2 =(float)157.00;
       float preço3 =(float)328.69;
       float preço4 =(float)199.78;
       float preço5 =(float) 1.994;
         int menu;
         float preço,total,quantidade;
        
            System.out.println("-----------PRODUTOS------------");
            System.out.println ("selecione o produto desejavel");
            System.out.println("1-cooler:  " + "R$" +  preço1);
            System.out.println("2-gabinete:  " + "R$" +  preço2);
            System.out.println("3-teclado:  " + "R$" +  preço3);
            System.out.println("4-mouse:  " + "R$" + preço4 );
            System.out.println("5-monitor: " +"R$" +  preço5);
            System.out.println("produto selecionado: ");
              menu = entrada.nextInt();
            System.out.println("informe a quantidade: ");
             quantidade = entrada.nextFloat();
        
            if(menu == 1){
             System.out.println("voce selecionou " + produto1);
             total =  preço1 * quantidade ;
             System.out.println("total a compra: " + total);
           }else if(menu == 2){
             System.out.println("voce selecionou: " + produto2);
             total = preço2 * quantidade ; 
              System.out.println("total da compra: " + total );
          }else if(menu == 3){
             System.out.println("voce selecionou: " + produto3);
             total = preço3 * quantidade;
             System.out.println("total a compra: " + total);
          }else if(menu == 4){
             System.out.println("voce selecionou" + produto4);
              total = preço4 * quantidade; 
              System.out.println("total a compra: " + total);
          }else if(menu == 5){
          System.out.println("voce selecionou: " + produto5);
          total = preço5 * quantidade ;  
          System.out.println("total a compra: " + total);
        }
        System.out.println("vlw pela compra mestre");
    }              
}        
        
        
        

        
     
        
    
    

