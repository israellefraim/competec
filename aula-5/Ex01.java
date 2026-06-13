import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// int numeros [] = {1, 2, 3};
		
		int numeros [] = new int[3];
		
		for(int i = 0; i < numeros.length; i++) {
		    numeros[i] = input.nextInt();
		}
		
		int soma = numeros[0] + numeros[1] + numeros[2];
		
		System.out.println(soma);
	}
}
