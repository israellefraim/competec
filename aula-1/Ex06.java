public class Ex06
{
	public static void main(String[] args) {
	    int idadeA = 19;
	    int idadeB = 21;
	    
	    //idades iguais e idadeA maior que 18
	    boolean comparacao1 = idadeA == idadeB && idadeA > 18;
	    
	    //idades diferentes e idadeB menor que 12
	    boolean comparacao2 = idadeA != idadeB && idadeB < 12;
	    
	    System.out.println("Idade A e Idade B são iguais E idade A é maior que 18: " + comparacao1);
	    System.out.println("Idade A e Idade B são diferentes E idade B é menor que 12: " + comparacao2);

	}
}