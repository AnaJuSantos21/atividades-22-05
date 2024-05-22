package AVFormativa;

import java.util.Scanner;

public class ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("Informe um valor fahrenheit: ");
		fahrenheit = ler.nextDouble();
		
		celsius = ((fahrenheit - 32)*5)/9;
		
		System.out.println("A temperatura convertida em celsius é: " + celsius);
        ler.close();
	}
     
}
