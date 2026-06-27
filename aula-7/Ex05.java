import java.util.Scanner;

public class Ex05
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = input.nextLine();
		
		String[] nomePicotado = nome.split(""); 
		
		String resultado = nome.split("")[0].toUpperCase();
        
        for (int i = 1; i < nome.length(); i++) {
            resultado += nomePicotado[i].toLowerCase();
        }
        
        /*
        String primeiraLetra = nome.substring(0, 1).toUpperCase();
        String restoDoNome = nome.substring(1).toLowerCase();
        
        System.out.println(primeiraLetra + restoDo Nome)
        */
        
        System.out.println(resultado);
	}
}
