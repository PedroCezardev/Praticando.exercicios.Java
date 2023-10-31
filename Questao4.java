// Leia dois vetores de números inteiros com a mesma quantidade. Exiba a intersecção dos vetores,
// ou seja,os números que são repetidos nos dois vetores.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[6];
        int[] vetorB = new int[6];

        System.out.println("Bem-vindo ao programa que exibe a intersecção dos vetores. Aproveite!");

        System.out.println("Digite os valores dos vetores: ");
        // entrada de dados no vetorA
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetorA(" + i + "): ");
            vetorA[i] = input.nextInt();
        }

        // entrada de dados no vetorB
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("vetorB(" + i + "): ");
            vetorB[i] = input.nextInt();
        }

        // usar a lista e o ArrayList
        List<Integer> interseccao = new ArrayList<>();

        // Laço for para fazer o cálculo da interseccao
         for (int elemento1 : vetorA) {
            for (int elemento2 : vetorB) {
                if (elemento1 == elemento2) {
                    interseccao.add(elemento1);
                    break;
                }
            }
        }

        System.out.println("Intersecção dos vetores: " + interseccao);
    }
}