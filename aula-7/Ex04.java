import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o nome completo: ");
        String nomeCompleto = input.nextLine();
        
        String[] nomeVetor = nomeCompleto.split(" ");
        
        System.out.println(nomeVetor[1]);
    }
}