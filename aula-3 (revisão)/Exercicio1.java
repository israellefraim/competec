import java.util.Scanner; // IMPORTANDO O SCANNER

public class Main {
 public static void main(String[] args) {
    
    // VARIÁVEIS DE PREÇOS DO MENU
    double hamburguer = 10.00;
    double batata = 5.00;
    double suco = 7.00;
    
    // DADOS DO CLIENTE
    double minhaCarteira;
    int opcao;
    int quantidade;
  
    // DADOS DO CARRINHO
    double valorTotal = 0;          // guarda o valor total da compra
    boolean compraAprovada = true;  // guarda se é possível fazer a compra ou não
  
    Scanner entrada = new Scanner(System.in);
  
  
    // MOSTRANDO O MENU NA TELA
    System.out.println("|******MENU*****|");
    System.out.println("|1 - hamburguer R$ 10.00|");
    System.out.println("|2 - batata R$ 5.00|");
    System.out.println("|3 - suco R$ 7.00|");
    
    // SOLICITANDO INFORMAÇÕES DO USUÁRIO
    System.out.println("|ESCOLHA SEU PEDIDO:");
    opcao = entrada.nextInt();
    
    System.out.println("Digite a quantidade desejada:");
    quantidade = entrada.nextInt();
    
    System.out.println("Digite quanto dinheiro voce tem:");
    minhaCarteira = entrada.nextInt();
  
    // CALCULANDO VALOR TOTAL DE ACORDO COM A OPÇÃO ESCOLHIDA
    switch(opcao) {
        case 1:
            valorTotal = hamburguer *quantidade;
            break;
        case 2:
            valorTotal = batata *quantidade;
            break;
        case 3:
            valorTotal = suco *quantidade;
            break;
        default:
            compraAprovada = false;
            System.out.println("A opção escolhida não existe, tente novamente!!!");
    }
  
    // APRESENTANDO O RESULTADO FINAL
    if(compraAprovada && valorTotal <= minhaCarteira) {
        if(valorTotal < minhaCarteira) {
          System.out.println("COMPRA REALIZADA! sobrou dinheiro :)");
        }
        else if(valorTotal == minhaCarteira) {
          System.out.println("COMPRA REALIZADA!");
        }
    }
    else {
      System.out.println("Nao deu pra comprar :(");
    }
 
 }
}