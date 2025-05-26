import java.util.Scanner;
public class Main
{
	public static void main(String[] args){ 
	    
	    Scanner sc = new Scanner(System.in);

        // 1 - TABUADA
        System.out.println("Digite um número para ver a tabuada: ");
        int tabuada = sc.nextInt();

        // O loop vai de 1 até 10. "i" vai representar os número de 1 ATÉ 10.
        for(int i = 1; i<=10; i++){ 
            int resposta = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resposta); // imprime a tabuada
        }


        // 2 - NÚMEROS ÍMPARES
        System.out.println("Digite um número N: ");
        int N = sc.nextInt();

	    // O loop vai de 0 até o N. "i" vai representar cada número ENTRE 0 e N.
	    for (int i = 0; i < N; i++){

	        if(i%2 != 0){ // Se o resto da divisão de i por 2 NÃO FOR ZERO, então ele é ímpar!
	            System.out.print(i + " "); // imprime o número ímpar
	        }
	    }
	    	        
	}
}