import java.util.Scanner;

public class Ex04
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Está chovendo: ");
		boolean chovendo = input.nextBoolean();
		
		System.out.print("Está relampejando: ");
	    boolean relampejando = input.nextBoolean();
	    
	    boolean euNaoVouSairDeCasa = chovendo && relampejando;
	    
	    System.out.print("Eu não vou sair de casa: " + euNaoVouSairDeCasa);
	}
}