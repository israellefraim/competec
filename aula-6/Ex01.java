import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arranjo [] = new int [5];
		
		for (int i = 0; i < arranjo.length; i++) {
		    System.out.print("Insira o " + (i+1) + "º número: ");
		    arranjo[i] = input.nextInt();
		    
		    if (arranjo[i] < 0 || arranjo[i] > 9) {
		        System.out.println("O valor precisa ser entre 0 e 9.");
		        i --;
		    }
		}
		
		boolean encontrou = false;
		
		for (int i: arranjo) {
		    int contador = 0;
		    
		    for (int j: arranjo) {
		        if (i == j) {
    		        contador++;
    		    }
		    }
		    
		    if (contador >= 3) {
		        encontrou = true;
		        break;
		    }
	    }
	    
	    if (encontrou) {
	        System.out.println("Sim");
	    } else {
	        System.out.println("Não");
	    }
    }
}
