/* 5) Leia um vetorde 10 númerosinteiros. 
      Em seguida, exiba-os em  ordem numérica decrescente.
      Faça o mesmo para um vetor de 10 nomes. 
 */

package com.mycompany.exerciciocinco;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        System.out.println("Digite os valores do vetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("vetorA[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }
        
        // Ordena o vetor em ordem decrescente usando Arrays.sort com comparador personalizado.
        Arrays.sort(vetorA);
        for (int i = 0; i < vetorA.length / 2; i++) {
            int temporario = vetorA[i];
            vetorA[i] = vetorA[vetorA.length - 1 - i];
            vetorA[vetorA.length - 1 - i] = temporario;
        }
        
        System.out.println("Os elementos do vetorA ordenados são: ");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
        
    }
}
