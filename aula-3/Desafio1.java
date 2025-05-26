import java.util.Scanner;
public class Main
{
	public static void main(String[] args){ 
	    
	    Scanner sc = new Scanner(System.in);

        // 1 - REPETINDO PALAVRAS
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // variável para controlar quantas vezes a palavra foi repetida
        int contador = 1;
        
        // O loop vai continar ENQUANTO "contador" for menor ou igual a 5.
        while(contador <= 5){
            System.out.println("Você disse: " + palavra);
            contador++; // aumenta a contagem em +1
        }


        // 2 - SOMANDO NÚMEROS
        int somaTotal = 0;  // Vai guardar a soma total
        int numero = 1;     // Vai guardar cada número entre 1 e 100

        // O loop vai continuar ENQUANTO "numero" for menor ou igual a 100.
        while(numero <= 100){
            somaTotal += numero;
            numero++;   // Aumenta o número em +1
        }

        System.out.println("A soma de todos os números de 1 a 100 é: " + somaTotal);
	}
}