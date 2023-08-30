package Exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float salarioBruto, adicionalNoturno, horasExtras, descontos;

		System.out.println("\nDigite seu Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("\nDigite seu Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.println("\nDigite suas Horas Extras: ");
		horasExtras = leia.nextFloat();

		System.out.println("\nDigite os descontos: ");
		descontos = leia.nextFloat();

		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;

		System.out.printf("\nSeu Salário Líquido é: R$%.2f", salarioLiquido);

	}

}
