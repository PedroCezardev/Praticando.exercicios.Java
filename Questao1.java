// Leia um vetor de notas, em que a quantidade é especificada pelo usuário. Em seguida, calcule a média das notas digitadas.
// Finamente, exiba o conjunto das notas maiores do que a média calculada, bem como e conjunto de notas menores do que a média.
// OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pergunta de quantas notas o usuario deseja inserir
        System.out.println("Quantas notas você deseja inserir? ");
        int quantidade = input.nextInt();

        // if pra retornar mensagem de erro, caso usuário digitar o valor "0"
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. O programa será encerrado.");
            return;
        }

        // criação do vetor
        double[] notas = new double[quantidade];
        double soma = 0;

        // usuário digitar as notas no vetor
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            double nota = input.nextDouble();

            // verifica se o número digitado é maior que 10
            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                soma += nota;
            } else {
                System.out.println("Nota inválida. Insira um valor entre 0 e 10.");
                i--; // Volta para a mesma posição no loop
            }
        }

        // faz média da quantidade de valores do vetor
        double media = soma / quantidade;

        // exibe os valores da média e das notas a cima e abaixo da média
        System.out.println("Média das notas: " + media);
        System.out.println("Notas maiores que a média: ");
        for (int i = 0; i < quantidade; i++) {
            if (notas[i] > media) {
                System.out.print(notas[i] + " ");
            }
        }
        System.out.println(); // Pula uma linha

        System.out.println("Notas menores que a média: ");
        for (int i = 0; i < quantidade; i++) {
            if (notas[i] < media) {
                System.out.print(notas[i] + " ");
            }
        }
    }
}