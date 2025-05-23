import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // DADOS DO USUÁRIO
		String nome1;
		String nome2;
		int minha_idade;
		int idade_professor;

		Scanner sc = new Scanner(System.in);

		// SOLICITANDO INFORMAÇÕES DO USUÁRIO
		System.out.println("Digite o seu nome:");
		nome1 = sc.nextLine();
		
		System.out.println("Digite o nome do colega ao lado:");
		nome2 = sc.nextLine();

		System.out.println("Digite a sua idade:");
		minha_idade = sc.nextInt();
		
		System.out.println("Digite a idade do professor:");
		idade_professor = sc.nextInt();


		// 1 - COMPARANDO OS NOMES
		if(nome1.equals(nome2)){  // Ao comparar STRINGS, usamos o método .equals() ao invés do ==
			System.out.println("OH MY GOD! Vocês são gêmeos!");
		}
		else{
			System.out.println("Vocês não são gêmeos!");
		}


		// 2 - COMPARANDO AS IDADES
		if(minha_idade < idade_professor){
			System.out.println("Você é mais novo que o professor!");
		}
		else if(minha_idade == idade_professor){
			System.out.println("OH MY GOD! Vocês são gêmeos!");
		}
		else{
			System.out.println("Professor, pode me chamar de sensei já.");
		}

	}
}