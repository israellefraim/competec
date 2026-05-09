import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //System é uma classe de java e 'in' significa um input do teclado

		double precoAbacaxi = 8.50;
		double precoGoiaba = 2;
		double precoLaranja = 1.3;

		System.out.println("-MERCADO DO SEU JOSÉ-");
		System.out.println("1 - Abacaxi");
		System.out.println("2 - Goiaba");
		System.out.println("1 - Laranja");

		System.out.print("\nInsira o código de um produto: ");
		int codigoProduto = input.nextInt();
		
        // printf permite formatar valores usando %: %.2f = decimal com 2 casas, %d = inteiro, %s = texto e %n = quebra de linha.
		if (codigoProduto == 1) {
			System.out.printf("Abacaxi: R$%.2f%n", precoAbacaxi);
		} else if (codigoProduto == 2) {
			System.out.printf("Goiaba: R$%.2f%n", precoGoiaba);
		} else {
			System.out.printf("Laranja: R$%.2f%n", precoLaranja);
		}
	}
}
