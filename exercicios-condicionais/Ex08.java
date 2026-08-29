import java.util.Scanner;

public class Ex08
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		String letra = input.nextLine().toUpperCase();
		
		switch (letra) {
		    case "A":
		    case "E":
		    case "I":
		    case "O":
		    case "U":
		        System.out.println(letra + " é uma vogal");
		        break;
		    default:
		        System.out.println(letra + " é uma consoante");
		}
	}
}
