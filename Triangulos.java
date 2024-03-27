package estruturaCondicional;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int medida1, medida2, medida3;

		System.out.println("Informe a primeira medida: ");
		medida1 = ler.nextInt ();

		System.out.println("Informe a segunda medida");
		medida2 = ler.nextInt();

		System.out.println("Informe a terceira medida");
		medida3 = ler.nextInt();

		if (medida1 == medida2 && medida1 == medida3) {
			System.out.println("O triângulo é equilátero");
		}	
		if (medida1 == medida2 && medida1 != medida3) {
			System.out.println("O triângulo é isóceles");
		}
		if (medida1 != medida2 && medida1 != medida3) {
			System.out.println("O triângulo é escaleno");
		}
		ler.close();
	}

}
