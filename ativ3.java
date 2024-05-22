package AVFormativa;

import java.util.Scanner;

public class ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor1,valor2,resultado1,resultado2,resultado3;
		String operacao;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		valor2 = ler.nextDouble();
		
		System.out.println("Informe a operação desejada +, - ou *: ");
		operacao = ler.next();
		
		resultado1 = (valor1 + valor2);
		resultado2 = (valor1 - valor2);
		resultado3 = (valor1 * valor2);
		
		if (operacao.equals ("+")) {
			System.out.println("O resultado é: " + resultado1);
		}
		
		else if (operacao.equals("-") ) {
			System.out.println("O resultado é: " + resultado2);
		}
		
		else {
			System.out.println("O resultado é: " + resultado3);
		}
		ler.close();
		

	}

}
