import java.util.Scanner;

public class Ex08 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em celsius: ");
        int celsius = input.nextInt();
        
        double fahrenheit = celsius * 1.8 + 32;
        
        System.out.printf(celsius + "°C = %.2f°F", fahrenheit);
    }
}