// Leia  um vetor de 10 números inteiros. Exiba este vetor acompanhado  do  seu elemento simétrico em relação a sua posição no conjunto.
// Veja o exemplo:Entrada: [5,7,9,2]Saída:[5–2,7 –9,9 –7,2 –5]

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int[] vetorA = new int[4];

       System.out.println("Digite os valores do vetor: ");

        // entrada dos valores no vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor(" + i + "): " );
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "-" + vetorA[vetorA.length - i - 1]);
        }
    }
}