/*  Ler 15 elementos numéricos inteiros de um vetor A. Construir um vetor B de mesmo
    tipo, observando a seguinte lei de formação: todo elemento do vetor B deve ser o
    quadrado do elemento correspondente do vetor A. Apresentar os elementos dos
        vetores A e B dispostos lado a lado.
 */

package com.mycompany.questaoquatroexercicio;

import java.util.Scanner;

public class QuestaoQuatroExercicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        
        // Ler os elementos do vetorA
        System.out.println("Digite os elementos do vetorA: ");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }
        
        // Calcular o quadrado e armazenar no vetorB]
        for (int i = 0; i < 15; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        
        // Ler os elementos do vetorB
        System.out.println("Resultado do vetorB: ");
        for (int i = 0; i < 15; i++) {
            System.out.println("B[" + i + "]: " + vetorB[i]);
        }
        
    }
}
