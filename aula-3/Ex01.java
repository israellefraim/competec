public class Ex01
{
	public static void main(String[] args) {
		boolean euEstudei = true;
		boolean euDormiBem = false;
		boolean gabaritarProva;
		
		if (euEstudei && euDormiBem) {
		    System.out.println("Eu gabaritei a prova.");
		    gabaritarProva = true;
		}
		else {
		    System.out.println("Preciso estudar mais.");
		    gabaritarProva = false;
		}
	}
}
