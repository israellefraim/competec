import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("\nBem Vindo " + nome + ".");
	}
}
