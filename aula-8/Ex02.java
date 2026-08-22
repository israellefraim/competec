import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nomeProduto [] = new String[3];
		double precoProduto [] = new double[3];
		int quantidadeProduto [] = new int[3];
		double valorTotal [] = new double[3];
		String produtoMaiorValor = "";
		
		for (int i = 0; i <= 2; i++) {
		    System.out.print("Insira o nome do " + (i+1) + "º produto: ");
		    nomeProduto[i] = input.nextLine(); // colocar só input.next não da problema do ENTER
		    
		    System.out.print("Insira o preço do " + (i+1) + "º produto: ");
		    precoProduto[i] = input.nextDouble();
		    
		    System.out.print("Insira a quantidade do " + (i+1) + "º produto: ");
		    quantidadeProduto[i] = input.nextInt();
		    
		    input.nextLine();
		    
		    valorTotal[i] = quantidadeProduto[i] * precoProduto[i];
		    
		    System.out.printf("Valor total de " + nomeProduto[i] + ": R$ %.2f \n\n", valorTotal[i]);
		    
		    if (i == 0) {
		        produtoMaiorValor = nomeProduto[i];
		    } else if (valorTotal[i] > valorTotal[i-1]) {
		        produtoMaiorValor = nomeProduto[i];
		    }
	    }
	    
	    System.out.println("O produto de maior valor é: " + produtoMaiorValor);
	}
}
