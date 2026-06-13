import java.util.*;

public class Ex03 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        
        int n = input.nextInt();
        
        int[] vetor = new int[n];
        
        for(int i = n-1; i >= 0; i--) {
            vetor[i] = input.nextInt();
        }
        
        for(int i: vetor) {
            System.out.print(i + " ");
        }
    }
}