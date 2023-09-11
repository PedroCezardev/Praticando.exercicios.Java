// Atividade: Criar, preencher e exibir um vetor
// Programa em Java que declara valores ao vetor, os retorna na tela e por fim soma todo o valor armazenado e os retorna para o usuário.

import java.util.Scanner;

public class AtividadeVetores
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double [] valores = new Double[10];
		
		System.out.println("Bem vindo ao nosso programa de criação de Vetores!");
		
		// Digitar o número ao Array
		for(int i = 0; i < valores.length; i++) {
		    System.out.println("Digite o número " + (i+1) + " do Vetor: ");
		    valores[i] = s.nextDouble();
		}
		
		// Mostrar os valores do Array na tela
		System.out.println("Valores no Vetor:");
		for (int i = 0; i < valores.length; i++) {
		    System.out.println(valores[i] + " ");
		}
		
		// Somar os valores do Array e exibir na tela.
		double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
            
        }
        
        System.out.println("O valor total é: " + total);
        
        System.out.println("Obrigado por usar nosso programa! Se necessário o execute de novo!");  
	}
}
