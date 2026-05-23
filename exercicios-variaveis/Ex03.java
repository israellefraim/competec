import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira sua idade em anos: ");
        int idadeAnos = input.nextInt();
        
        int idadeDias = idadeAnos * 365;
        
        System.out.print("\nA sua idade em dias é: " + idadeDias);
    }
}