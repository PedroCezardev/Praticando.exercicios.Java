//Leia um vetorde20 valores inteirose,em seguida,exiba-os na ordem inversa do que foram digitados.

import java.util.Scanner;

public class inverçãoVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[20];

        System.out.println("Bem-vindo ao programa que inverte a ordem dos valores digitados: ");

        // código para digitar os valores do vetor
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor(" + i + "): ");
            vetorA[i] = input.nextInt();
        }

        // código para exebir os valores na ordem inversa
        System.out.println("os valores na ordem inversa: ");
        for (int i = vetorA.length - 1; i >= 0; i--) {
            System.out.println("vetor(" + i + "): " + vetorA[i]);
        }
    }
}