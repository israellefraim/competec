import java.io.IOException;
import java.util.Scanner;

public class Idade_Em_Dias {
 	public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       int total = sc.nextInt();
       int anos = total/365;
       int meses = (total - anos*365)/30;
       int dias = total - anos*365 - meses*30;
       System.out.println(anos+ " ano(s)");
        System.out.println(meses +" mes(es)");
         System.out.println(dias+ " dia(s)");
 
    }
 
}
