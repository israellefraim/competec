import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("A: ");
		int a = input.nextInt();
		
		System.out.print("B: ");
		int b = input.nextInt();
		
		int trocador = a;
		
		a = b;
		b = trocador;
		
		System.out.println("\nA: " + a);
		System.out.println("B: " + b);
	}
}
