import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS DE SENHA
        int senha;
        int tentativaSenha;

        // SOLICITANDO INFORMAÇÕES DO USUÁRIO
        System.out.println("Digite sua senha verdadeira: ");
        senha = sc.nextInt();

        do {
            System.out.println("Digite sua tentativa de senha: ");
            tentativaSenha = sc.nextInt(); // LENDO A TENTATIVA DE SENHA

            if (tentativaSenha != senha) {
                System.out.println("Sua tentativa de senha foi incorreta!!!");
            } else {
                System.out.println("Sua tentativa de senha foi correta!!!");
            }

        } while (tentativaSenha != senha); // REPITA ENQUANTO A TENTATIVA FOR DIFERENTE DA SENHA

    }
}
