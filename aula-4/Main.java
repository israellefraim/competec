import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        
        int x = 1;
        int somaValores = 0;
        
        while (x != 0) {
            x = input.nextInt();
            if (x == 0) {
                break;
            }
            
            if (x % 2 == 0) {
                somaValores = 0;
                for (int i = 0; i < 5; i++) {
                    somaValores += x;
                    x += 2;
                }
                System.out.println(somaValores);
            } 
            
            else {
                somaValores = 0;
                for (int i = 0; i < 5; i++) {
                    if (i == 0) {
                        x += 1;
                    }
                    somaValores += x;
                    x += 2;
                }
                System.out.println(somaValores);
            }
            
        }
        input.close();
	}
}
