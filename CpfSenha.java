package estruturaCondicional;

import java.util.Scanner;

public class CpfSenha {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int senha, cpf, saldo=500, valor;

		System.out.println("Informe seu CPF");
		cpf = ler.nextInt();
		
		if (cpf == 478129288) {
			System.out.println("Informe sua senha");
			senha = ler.nextInt();

			if (senha == 123456) {
				System.out.println("Bem vindo seu saldo é de " + saldo);
				System.out.println("Quanto deseja sacar?");
				valor = ler.nextInt();
				
				if (valor <= saldo) {
					System.out.println("Seu saque foi feito com sucesso");
				}
					else {
						System.out.println("O valor desejado é maior do que o saldo informado, tente novamente.");
					}
				}
			else {
				System.out.println("A senha esta incorreta, tente novamente");
			}

		}
			else {
				System.out.println("O CPF esta incorreto, tente novamente");
			}
		ler.close();
		}
	}





