import java.util.Scanner;

public class Ex05
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o valor do produto: R$");
	    double valor = input.nextDouble();
	    
	    double novoValor = valor * 0.9;
	    
	    System.out.printf("%.2f -> 10%% de desconto -> %.2f", valor, novoValor);
	}
}
