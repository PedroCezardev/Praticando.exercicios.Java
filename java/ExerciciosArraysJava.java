/*  Ler oito elementos numéricos inteiros em um vetor A. Construir um vetor B de
    mesma dimensão com os elementos do vetor A multiplicados por 3. Apresentar os
    elementos do vetor B.
*/  

package com.mycompany.exerciciosarrays.java;

import java.util.Scanner;

public class ExerciciosArraysJava {

    public static void main(String[] args) {
        double[] vetorA = new double[8];
	    
	    vetorA[0] = 6.0;
	    vetorA[1] = 7.5;
	    vetorA[2] = 8.2;
	    vetorA[3] = 2.3;
	    vetorA[4] = 1.5;
	    vetorA[5] = 4.9;
	    vetorA[6] = 3.0;
	    vetorA[7] = 9.0;
	    
	   
	System.out.println("Elemento do Array 4: " + vetorA[4]);
        
        double[] vetorB = new double[8];
	    
	    vetorB[0] = 18.0;
	    vetorB[1] = 22.5;
	    vetorB[2] = 24.6;
	    vetorB[3] = 6.9;
	    vetorB[4] = 4.5;
	    vetorB[5] = 14.7;
	    vetorB[6] = 9.0;
	    vetorB[7] = 27.0;
            
            
        for (double elemento: vetorB) {
            System.out.println("Todos os elementos do vetorB: " + elemento);
        }
	    
	   
    }
}
