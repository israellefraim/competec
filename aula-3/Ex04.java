import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int numero = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int valorTabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + valorTabuada);
        }
    }
}