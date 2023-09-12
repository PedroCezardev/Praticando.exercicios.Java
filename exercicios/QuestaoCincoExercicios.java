/*  Ler 20 elementos numéricos inteiros para um vetor A e construir um vetor B de
    mesma dimensão com os mesmos elementos de A. Eles devem estar invertidos, ou
    seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A
    passa a ser o penúltimo de B, e assim por diante. Apresentar os elementos dos dois
    vetores.
 */

package com.mycompany.questaocinco.exercicios;

import java.util.Scanner;

public class QuestaoCincoExercicios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // declarando arrays
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        
        // entrada de dados vetorA
        System.out.println("Digitide os valores do vetorA: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }
        
        // Ler elementos vetorB
        for (int i = 0; i < 10; i++) {
            vetorB[i] = vetorA[10 - 1 - i];
        }
        
        // exibir vetorA
        System.out.println("\nOs valores do vetorA são: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        // exibir vetorB
        System.out.println("\nOs valores do vetorB são: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
