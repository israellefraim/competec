import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		double precoAbacaxi = 7.3;
		double precoMaca = 2;
		double precoPera = 3;
		
		System.out.print("Insira a quantidade de abacaxis comprados: ");
		int quantidadeAbacaxi = input.nextInt();
		System.out.print("Insira a quantidade de maçãs compradas: ");
		int quantidadeMaca = input.nextInt();
		System.out.print("Insira a quantidade de peras compradas: ");
		int quantidadePera = input.nextInt();
		
		double valorTotal = (precoAbacaxi * quantidadeAbacaxi) + (precoMaca * quantidadeMaca) + (precoPera * quantidadePera);
		
		System.out.print("\nO valor total da compra foi de R$" + valorTotal);
	}
}
