import java.io.IOException;
import java.util.Scanner;
 
public class Media_3 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float media = (n1*2 + n2*3 + n3*4 + n4)/10;
        boolean exame = false;
        System.out.printf("Media: %.1f\n", media);
        if(media >= 5 && media < 7){
            exame = true;
            System.out.println("Aluno em exame.");
            float nota = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", exame);
            media = (media + nota)/2;
        }
        if(media >= 5){
            System.out.println("Aluno aprovado.");
        }else System.out.println("Aluno reprovado.");
        if(exame) System.out.printf("Media final: %.1f\n", media);
       
    }
 
}
