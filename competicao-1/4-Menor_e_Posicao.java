import java.io.IOException;
import java.util.Scanner;
 
public class Menor_e_Posicao {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();
        int menor = 0;
        int num = 0;
        int pos = 0;
        for(int i = 0; i < tamanho; i++){
            num = sc.nextInt();
            if(i == 0){
                menor = num;
            }else if(menor > num){
                menor = num;
                pos = i;
            }
        }
        System.out.println("Menor valor: " +menor);
        System.out.println("Posicao: " +pos);
       
 
    }
 
}
