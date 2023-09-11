/*  Ler dois vetores A e B com 20 elementos numéricos inteiros. Construir um vetor C,
    sendo cada elemento de C a subtração do elemento correspondente de A com B.
    Apresentar os elementos do vetor C.
*/

package com.mycompany.subtracaovetores;

import java.util.Scanner;

public class SubtracaoVetores {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         // Definir o tamanho dos vetores
         int tamanho = 10;
         
         // Declarar os vetores A, B, e C
         int[] A = new int[tamanho];
         int[] B = new int[tamanho];
         int[] C = new int[tamanho];
         
         // Ler os elementos do Vetor A
         System.out.println("Digite os elementos do vetor A: ");
         for (int i = 0; i < tamanho; i++) {
             System.out.print("A[" + i + "]: ");
             A[i] = input.nextInt();
         }
         
         // ler elementos do Vetor B
         System.out.println("Digite os elementos do vetor B: ");
         for (int i = 0; i < tamanho; i++) {
             System.out.print("B[" + i + "]: ");
             B[i] = input.nextInt();
         }
         
         // Calcular a subtração e armazenar em C
         for (int i = 0; i < tamanho; i++) {
             C[i] = A[i] -  B[i];
         }
         
         // Apresentar os elementos do vetor C
         System.out.println("Vetor C (A - B): ");
         for (int i = 0; i < tamanho; i++) {
             System.out.println("C[" + i + "]: " + C[i]);
         }
         
         input.close();
     }
}
