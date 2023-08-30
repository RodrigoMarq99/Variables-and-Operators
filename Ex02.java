package Exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float nota1, nota2, nota3, nota4;

		System.out.println("\nDigite sua primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("\nDigite sua segunda nota: ");
		nota2 = leia.nextFloat();

		System.out.println("\nDigite sua terceira nota: ");
		nota3 = leia.nextFloat();

		System.out.println("\nDigite sua quarta nota: ");
		nota4 = leia.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("Sua média é: %.2f", media);
	}

}
