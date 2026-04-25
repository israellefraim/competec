import java.util.Scanner;

public class Ex03
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		int minhaIdade = 17;
		
		System.out.print("Insira a idade do professor: ");
		int idadeProf = input.nextInt();
		
		boolean souMaisNovoQueOProfessor = minhaIdade < idadeProf;
		
		System.out.print("Sou mais novo que o professor: " + souMaisNovoQueOProfessor);
	}
}