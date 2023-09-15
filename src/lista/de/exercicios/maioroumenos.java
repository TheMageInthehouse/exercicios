

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vicentin.7910
 */
public class maioroumenos {
     public static void main(String[] args){
     Scanner in = new Scanner(System.in);
	int a = 0, maior = 0, menor = 0;

	for(int x = 0; x < 4; x++){
		
		System.out.println("Insira um valor:");
		a = in.nextInt();
		
		if(x == 0){
			
			maior = a;
			menor = a;
		}
		
		if(a > maior){
			
			maior = a;
		}
		
		if(a < menor){
			
			menor = a;
		}
	}
	
	System.out.print("Maior: "+ maior +". Menor: "+ menor);

     }
}
