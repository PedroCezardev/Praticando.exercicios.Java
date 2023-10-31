// Leia  dois vetoresde  números inteiros já ordenados de forma crescente.
// Crie um outro vetor para armazenar os dois conjuntos unidos, sendo que os númerosno outro vetordevem permanecer ordenados.
// Finalmente, exiba este vetor resultante. OBS:os vetores iniciais podem ter o tamanho diferente.

import java.util.Arrays;
import java.util.Scanner;

public class UnirVetoresOrdenados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[6];
        int[] vetor2 = new int[6];

        System.out.println("Digite os valores do vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor1(" + i + "): ");
            vetor1[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Vetor2(" + i + "): ");
            vetor2[i] = input.nextInt();
        }

        int[] vetorUnido = unirVetoresOrdenados(vetor1, vetor2);

        Arrays.sort(vetorUnido);

        System.out.println("Vetores unidos e ordenados: " + Arrays.toString(vetorUnido));
    }

    public static int[] unirVetoresOrdenados(int[] vetor1, int[] vetor2) {
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorUnido = new int[tamanhoTotal];

        int i = 0, j = 0, k = 0;

        while (i < vetor1.length && j < vetor2.length) {
            if (vetor1[i] < vetor2[j]) {
                vetorUnido[k++] = vetor1[i++];
            } else {
                vetorUnido[k++] = vetor2[j++];
            }
        }

        while (i < vetor1.length) {
            vetorUnido[k++] = vetor1[i++];
        }

        while (j < vetor2.length) {
            vetorUnido[k++] = vetor2[j++];
        }

        return vetorUnido;
    }
}