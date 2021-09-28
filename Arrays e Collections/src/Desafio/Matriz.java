package Desafio;

import java.util.Scanner;

public class Matriz {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Alunos");
		int qtdAlunos = input.nextInt();
		System.out.println("Notas");
		int qtdNotas = input.nextInt();
		
		double[] [] notas = new double [qtdAlunos] [qtdNotas];
		
		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno " + (i+1));
			for (int j = 0; j < notas[i].length ; j++) {
				System.out.println("Notas " + (j+1));
				notas [i] [j] = input.nextDouble();
				total += notas [i] [j];
			}
			
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média: " + media);
	}
	

}
