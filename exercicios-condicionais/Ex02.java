import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é PAR");
        } else {
            System.out.println(numero + " é ÍMPAR");
        }
    }
}