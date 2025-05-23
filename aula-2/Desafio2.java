public class Main {
	public static void main(String[] args) {

		// INFORMAÇÕES SOBRE O TEMPO
        boolean estaChovendo = true;
        boolean estaRelampejando = true;

        // 1 - LÓGICA DO TEMPORAL:
        if(estaChovendo && estaRelampejando) {
            System.out.println("Não vou sair de casa, está chovendo E relampejando!");
        } else {
            System.out.println("Pode sair, não está chovendo e relampejando ao mesmo tempo!");
        }

        // INFORMAÇÕES SOBRE O ALMOÇO
        boolean temMacarrao = false;
        boolean temEstrogonofe = true;
        
        // 2 - LÓGICA DO BANDEIJÃO:
        if(temMacarrao || temEstrogonofe) {
            System.out.println("Eu estou muito feliz! Vou comer macarrão OU estrogonofe!");
        } else {
            System.out.println("Não vou comer macarrão nem estrogonofe hoje :(");
        }
	}
}
