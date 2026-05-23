import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        int primeiroNumero = input.nextInt();
        
        System.out.print("Insira o segundo número: ");
        int segundoNumero = input.nextInt();
        
        int somaNumeros = primeiroNumero + segundoNumero;
        
        System.out.print("A soma dos números é: " + somaNumeros);
    }
}