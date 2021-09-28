package Desafio;

import java.util.Scanner;

public class Arrays {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.printf("Quantidade de notas : ");
		int qtdNotas = input.nextInt();
		input.nextLine();
		
		double[] notas = new double [qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota %d : ", i+1);
			notas [i] = readInterger();
		}
		
		double total = 0;
		System.out.printf("Notas do Aluno : ");
		for(double nota: notas) {
			System.out.printf(nota + " ");
			total += nota;
		}
		System.out.println("\nA média do Aluno é:  " + total / notas.length);
		
	}
	public static double readInterger () {
		double value = input.nextDouble();
		input.nextLine();
		return value;
	}

}
