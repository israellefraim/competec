import java.util.Scanner;   // IMPRIMINDO SCANNER

public class Main
{
	public static void main(String[] args) {

        // CRIANDO O SCANNER:
        Scanner sc = new Scanner(System.in);
        
        // SOLICITANDO O VALOR DE N:
        System.out.print("Digite a quantidade N de numeros: ");
        int N = sc.nextInt();

        // CRIANDO UM VETOR VAZIO DE N POSIÇÕES:
        int[] numeros = new int[N];

        // PREENCHENDO O VETOR COM OS NÚMEROS DIGITADOS:
        for(int i = 0; i < N; i++){
            System.out.print("Digite o número da posicao " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // MOSTRANDO OS NUMEROS DO VETOR:
        for(int i =  0; i < N; i++){
            System.out.print(numeros[i] + " ");
        }
        
	}
}
