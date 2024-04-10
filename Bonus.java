package estruturaCondicional;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int tempo;
		System.out.println("Informe o tempo que você está trabalhando na empresa: ");
		tempo = ler.nextInt();
		
		String msg = (tempo>=3)? "Seu bônus é de 7%": "Seu bônus é de 5%";
		System.out.println(msg);
		ler.close();
	}

}
