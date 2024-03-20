package estruturaCondicional;

import java.util.Scanner;

public class DiadaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		
		System.out.println("Digite o número corresponendente ao dia da semana ");
		dia = ler.nextInt();
		
		
		if (dia == 1) {
		System.out.println("O dia da semana é domingo");
		}
		else if (dia == 2) {
		System.out.println("O dia da semana é segunda");
		}
		
		else if (dia == 3) {
		System.out.println("O dia da semana é terça");
		}
		
		else if (dia == 4) {
		System.out.println("O dia da semana é quarta");
		}
		else if (dia == 5) {
		System.out.println("O dia da semana é quinta");
		}
		else if (dia == 6) {
		System.out.println("O dia da semana é sexta");
		}
		else if (dia == 7) {
		System.out.println("O dia da semana é domingo");
	}
		
		else  {
		System.out.println("O número não é correspondente");
		
		}
		ler.close();

		}
	

}
