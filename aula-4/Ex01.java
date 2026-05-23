import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String senhaCorreta = "Fogo@123";
		
		while (true) {
		    System.out.print("Insira a sua senha: ");
		    String senhaUsuario = input.nextLine();
		    
		    if (senhaCorreta.equals(senhaUsuario)) {
		        System.out.print("Acesso permitido");
		        break;
		    } 
		    
		    System.out.println("Senha Inválida\n");
		}
		
		input.close();
	}
}
