import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}