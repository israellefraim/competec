import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double notas [][] = new double [5][3];
		double media [] = new double [5];
		
		for (int i = 0; i < notas.length; i++) {
		    for (int j = 0; j < notas[i].length; j++) {
		        notas[i][j] = input.nextDouble();
		        media[i] += notas[i][j];
		    }
		    media[i] = media[i] / notas[i].length;
		    System.out.printf("Media: %.2f \n", media[i]);
		}
    }
}
