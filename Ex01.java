package Exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float salario, abono;

		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();

		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();

		float novoSalario = salario + abono;

		System.out.printf("O novo salário será: R$%.2f", novoSalario);

	}

}
