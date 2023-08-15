// Aprendendo git com Java
import java.util.Scanner;

public class AprenGit
{
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		String str, str1, str2, str3;
		System.out.println("Bem-vindo ao nosso código para aprender Git com Java");
		
		do {
		    
		    System.out.println("Como está sendo seu aprendizado com Git?");
		        str = texto.nextLine();
		
		    System.out.println("O que é a plataforma Git?");
		        str1 = texto.nextLine();
		
		    System.out.println("O que é Github?");
		        str2 = texto.nextLine();
		
		    System.out.println("Você gostou de aprender a versionar códigos com Git?");
		        str3 = texto.nextLine();
		
		    System.out.println("\nDeseja responder as perguntas novamente? (S/N)");
		
		} while (texto.nextLine().equalsIgnoreCase("S"));
		
		    System.out.println("Código encerrado, obrigado por usar nosso programa!");
		
	    
	}
}
