/*  Faça um programa que defina dois vetores do tipo inteiro, um chamado par e outro chamado ímpar. 
    Cada  vetor  deve  conter  10  elementos. 
    A  seguir, faça  um  laço de repetição  com  10  iterações  e  que  contenha  internamente  a  geração  randômica  de números entre 1 e 20. 
    Se o valor gerado for par, armazene no vetor chamado par, caso contrário, no vetor chamado ímpar. Ao final, apresente o conteúdo de cada um dos vetores. 
*/

import java.util.Random;

public class questaoOito
{
	public static void main(String[] args) {
	    int quantidade = 10;
        int[] par = new int[quantidade];
        int[] impar = new int[quantidade];
        Random rand = new Random();

        for (int i = 0; i < quantidade; i++) {
            int numeroAleatorio = rand.nextInt(20) + 1;
            
            if (numeroAleatorio % 2 == 0) {
                par[i] = numeroAleatorio;
            } else {
                impar[i] = numeroAleatorio;
            }
        }
        
        System.out.println("Estes são os números Pares: ");
        exibirVetor(par);
        
        System.out.println("Estes são os números ímpares: ");
        exibirVetor(impar);
    }
    
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }
}
