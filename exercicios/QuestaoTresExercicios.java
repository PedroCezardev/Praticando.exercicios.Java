/*  Ler dois vetores A com cinco elementos e B com dez elementos (valores numéricos
    inteiros). Construir um vetor C, que é a junção dos dois outros vetores. Dessa forma,
    C deve ter a capacidade de armazenar 15 elementos. Apresentar os elementos do
    vetor C.
*/

package com.mycompany.questaotres.exercicios;

import java.util.Scanner;

public class QuestaoTresExercicios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // iniciar vetores
        int[] vetorA = new int[5];
        int[] vetorB = new int[10];
        int[] vetorC = new int[15];
        
        // Ler elemenotos vetorA
        System.out.println("Digite os elementos do vetorA: ");
        for (int i = 0; i < 5; i++){
            System.out.print("A[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }
        
        // Ler elementos vetorB
        System.out.println("Digite os elementos do vetorB: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = input.nextInt();
        }
        
        // Copiar os elementos de A para C
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        
        // Copiar os elementos de B para C a partir da posição final de A
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }
        
        // Retornar elementos do vetorC
        System.out.println("Os elementos do vetorC são: ");
        for (int i = 0; i < 15; i++) {
            System.out.println("C[" + i + "]: " + vetorC[i]);
        }
        
        input.close();
     }
}
