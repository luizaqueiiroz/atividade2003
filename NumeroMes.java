package estruturaCondicional;

import java.util.Scanner;

public class NumeroMes {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int mes;
		System.out.println("Digite o número corresponendente ao mês ");
		mes = ler.nextInt();
		
		
		if (mes == 1) {
		System.out.println("O mês correspondente é janeiro");
		}
		else if (mes == 2) {
		System.out.println("O mês correspondente é fevereiro");
		}
		
		else if (mes == 3) {
		System.out.println("O mês correspondente é março");
		}
		
		else if (mes == 4) {
		System.out.println("O mês correspondente é abril");
		}
		else if (mes == 5) {
		System.out.println("O mês correspondente é maio");
		}
		else if (mes == 6) {
		System.out.println("O mês correspondente é junho");
		}
		else if (mes == 7) {
		System.out.println("O mês correspondente é julho");
		}
		else if (mes == 8) {
		System.out.println ("O mês correspondente é agosto");
		}
		else if (mes == 9) {
		System.out.println ("O mês correspondente é setembro");
		}
		else if (mes == 10) {
		System.out.println ("O mês correspondente é outubro");
		}
		
		else if (mes == 11) {
		System.out.println("O mês correspondente é novembro");
		}
		
		else if (mes == 12) {
		System.out.println("O mês correspondente é dezembro");
		}
		else  {
		System.out.println("Mês inválido");
		
		}
		ler.close();

		}
	



	}


