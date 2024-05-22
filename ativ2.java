package AVFormativa;

import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double area,lado;
		
		System.out.println("Informe o valor de um dos lados do quadrado: ");
		lado = ler.nextDouble();
		
		area = (lado*lado);
		
		System.out.println("O valor da área do quadrado é: " + area);
		ler.close();

	}

}
