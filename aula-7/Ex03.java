import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String palavraSecreta = "BATATA";
        
        System.out.print("Insira a palavra secreta: ");
        String respostaUsuário = input.nextLine();
        
        if (palavraSecreta.equalsIgnoreCase(respostaUsuário)) {
            System.out.println("\nParabéns, você acertou!");
        } 
        else {
            System.out.println("\nQue pena, você errou!");
        }
    }
}