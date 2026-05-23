import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira uma palavra: ");
        String palavraUsuario = input.nextLine();
        
        int i = 0;
        
        while (i < 5) {
            System.out.println(palavraUsuario);
            i++;
        }
    }
}