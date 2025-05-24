import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		// MENU DE PREÇOS
		double abacaxi = 8.50;
		double goiaba = 2.00;
		double laranja = 1.30;
		
		// DADOS DO USUÁRIO
		int opcao;

		Scanner sc = new Scanner(System.in);

		// SOLICITANDO INFORMAÇÕES DO USUÁRIO
		System.out.println("1 - Abacaxi");
		System.out.println("2 - Goiaba");
		System.out.println("3 - Laranja");

		System.out.println("Escolha uma das opções para conferir seu preço:");
		opcao = sc.nextInt();
		
		// LÓGICA DO MENU DE PREÇOS
		switch(opcao) {
			case 1:
				System.out.println("O preço do abacaxi é: R$" + abacaxi);
				break;
			case 2:
				System.out.println("O preço da goiaba é: R$" + goiaba);
				break;
			case 3:
				System.out.println("O preço da laranja é: R$" + laranja);
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
		}

	}
}