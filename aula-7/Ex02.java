import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        
        int tamanhoNome = nome.length();
        
        System.out.println("\nOlá " + nome + ", seu nome tem " + tamanhoNome + " caracteres.");
    }
}