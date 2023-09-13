/*  Faça um programa que preencha um vetor com dez números reais, 
    calcule e mostre a quantidade de números negativos e a soma dos números positivos desse vetor.
*/   

import java.util.Scanner;

public class questaoSete {
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double[] vetorA = new double[10];
	    
	    int numeroNegativo = 0;
	    int somaPositivo = 0;
	    
		System.out.println("Digite os valores reais do vetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
		    System.out.print("vetorA [" + i + "]: ");
		    vetorA[i] = input.nextDouble();
		}
		
		for (double numero : vetorA) {
		    if (numero < 0) {
		        numeroNegativo++;
		    } else if (numero > 0) {
		        somaPositivo += numero;
		    }
		}
		
		System.out.println("A quantidade de numeros negativos é: " + numeroNegativo);
		System.out.println("A soma dos numeros positivos é: " + somaPositivo);
	}
}
