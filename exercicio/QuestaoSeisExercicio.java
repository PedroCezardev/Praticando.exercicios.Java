/*  Faça um programa que leia um vetor com quinze posições para números inteiros.
    Crie, a seguir, um vetor resultante que contenha todos os números primos do vetor
    digitado. Escreva o vetor resultante.
 */

package com.mycompany.questaoseis.exercicio;

import java.util.Scanner;

public class QuestaoSeisExercicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // declarar vetor
        int[] vetorA = new int[15];
        
        // Ler os elementos do vetorA
        System.out.println("Digite os elementos do vetorA: ");
        for (int i = 0; i < 15; i++) {
            System.out.print("vetorA[" + i + "]: ");
            vetorA[i] = input.nextInt();
        }
        
        // Encontrar os números primos e contar quantos são primos
        // vetor para armazenar números primos
        int[] vetorPrimos = new int[15];
        int contadorPrimos = 0;
        // Contador de números primos no vetor
        
        for (int i = 0; i < 15; i++) {
            if (isPrimo(vetorA[i])) {
                vetorPrimos[contadorPrimos] = vetorA[i];
                contadorPrimos++;
            }
        }
        
        // exibir os números armazenados no vetorA
        System.out.println("Os números armazenados no vetorA são: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetorA[i] + " ");
        }

        // /exibir os números primos no vetor resultante
        System.out.println("\nOs números primos armazenados são: ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(vetorPrimos[i] + " ");
        }
        
        input.close();
    }
    
    // função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for ( int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
