import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //System é uma classe de java e 'in' significa um input do teclado

		double precoAbacaxi = 8.50;
		double precoGoiaba = 2;
		double precoLaranja = 1.3;
		double valorTotal;

		System.out.println("-MERCADO DO SEU JOSÉ-");
		System.out.println("1 - Abacaxi");
		System.out.println("2 - Goiaba");
		System.out.println("3 - Laranja");

		System.out.print("\nInsira o código de um produto: ");
		int codigoProduto = input.nextInt();
		
		System.out.print("Insira a quantidade da fruta escolhida: ");
		int quantidadeFruta = input.nextInt();
		
        // printf permite formatar valores usando %: %.2f = decimal com 2 casas, %d = inteiro, %s = texto e %n = quebra de linha.
        switch (codigoProduto) {
            case 1:
                valorTotal = quantidadeFruta * precoAbacaxi;
		        System.out.printf("\nValor total: R$%.2f%n", valorTotal);
			    break;
			case 2:
			    valorTotal = quantidadeFruta * precoGoiaba;
			    System.out.printf("\nValor total: R$%.2f%n", valorTotal);
			    break;
		    case 3:
		        valorTotal = quantidadeFruta * precoLaranja;
			    System.out.printf("\nValor total: R$%.2f%n", valorTotal);
			    break;
		    default:
		        System.out.print("\nEsse produto não existe.");
        }
	}
}
