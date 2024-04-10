package estruturaCondicional;

import java.util.Scanner;

public class SwicthMes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;
		System.out.println("Digite o número corresponendente ao mês ");
		mes = ler.nextInt();

		switch (mes) {

		case 1: 
			System.out.println("O mês correspondente é janeiro");
			break;

		case 2: 
			System.out.println("O mês correspondente é fevereiro");
			break;

		case 3: 
			System.out.println("O mês correspondente é março");
			break;

		case 4:
			System.out.println("O mês correspondente é abril");
			break;

		case 5:
			System.out.println("O mês correspondente é maio");
			break;

		case 6:
			System.out.println("O mês correspondente é junho");
			break;

		case 7:
			System.out.println("O mês correspondente é julho");
			break;

		case 8:
			System.out.println ("O mês correspondente é agosto");
			break;

		case 9:
			System.out.println ("O mês correspondente é setembro");
			break;

		case 10:
			System.out.println ("O mês correspondente é outubro");
			break;

		case 11:
			System.out.println("O mês correspondente é novembro");
			break;

		case 12:
			System.out.println("O mês correspondente é dezembro");
			break;

		default:
			System.out.println("Mês inválido");

		}
		ler.close();

	}

}
