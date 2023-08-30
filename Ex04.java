package Exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4;

		System.out.println("\n1° valor: ");
		n1 = leia.nextFloat();

		System.out.println("\n2° valor: ");
		n2 = leia.nextFloat();

		System.out.println("\n3° valor: ");
		n3 = leia.nextFloat();

		System.out.println("\n4° valor: ");
		n4 = leia.nextFloat();
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença entre (n1 x n2) e (n3 x n4) é: %.2f", diferenca);
	}

}
