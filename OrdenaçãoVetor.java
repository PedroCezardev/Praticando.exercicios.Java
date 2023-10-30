// Leia um vetor de 10 números inteiros. Em seguida, exiba-os em ordem numérica decrescente.
// Faça o mesmo para um vetor de 10 nomes.

import java.util.Arrays;
import java.util.Scanner;

public class OrdenaçãoVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];

        // inserir os valores nos arrays
        System.out.println("Bem-vindo a algaritmo para armazenar valores em Vetores:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor " +(i+1) + " do vetor: ");
            vetorA[i] = input.nextInt();
        }

        // Ordena os vetores em ordem crescente
        Arrays.sort(vetorA);

        // Inverter o vetor para ordem decrescente
        for (int i = 0; i < vetorA.length / 2; i++) {
            int temp = vetorA[i];
            vetorA[i] = vetorA[vetorA.length - 1 - i];
            vetorA[vetorA.length - 1 - i] = temp;
        }

        //retornar os valores para o usuário
        System.out.println("Os valores do vetor em ordem decrescente: ");
        for (int i = 0; i < vetorA.length; i++) {
            for (int valor : vetorA);
            System.out.println("Vetor(" + i + "): " + vetorA[i]);
        }

    }
}