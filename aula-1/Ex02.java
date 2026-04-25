import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String meuNome = input.nextLine();
		
		System.out.print("Insira o nome do seu colega: ");
		String colegaNome = input.nextLine();
		
		boolean nomeEIgual = meuNome.equals(colegaNome);
		System.out.print("Os nomes são iguais: " + nomeEIgual);
	}
}
