public class Main {
	public static void main(String[] args) {

		// INFORMAÇÕES SOBRE AS PESSOAS
        int idade_A = 16;
        int idade_B = 21;

        // 1 - LÓGICA DAS MAIORIDADES:
        if( (idade_A == idade_B) && (idade_A > 18) ) {
            System.out.println("As pessoas têm a mesma idade, E são maiores de 18 anos.");
        } else{
            System.out.println("As pessoas não têm a mesma idade, OU TALVEZ não são maiores de 18 anos, OU TALVEZ ambos.");
        }

        // 2 - LÓGICA DA MENOR IDADE:
        if((idade_A != idade_B) && (idade_B < 12)) {
            System.out.println("As pessoas não têm a mesma idade, E a pessoa B tem menos de 12 anos.");
        } else{
            System.out.println("As pessoas têm a mesma idade, OU TALVEZ a pessoa B não tem menos de 12 anos, OU TALVEZ ambos.");
        }
	}
}
