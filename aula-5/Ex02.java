import java.util.Scanner;

public class Ex02 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        
        int n = input.nextInt();
        
        int[] vetor = new int[n];
        
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }
        
        for(int i: vetor) {
            System.out.print(i + " ");
        }
    }
}