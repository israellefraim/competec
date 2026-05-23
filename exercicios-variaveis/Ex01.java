import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nomeUsuario = input.nextLine();
		
		System.out.print("Olá, " + nomeUsuario + "! Bem vindo ao mundo da programação!");
	}
}
