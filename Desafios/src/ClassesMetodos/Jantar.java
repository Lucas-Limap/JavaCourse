package ClassesMetodos;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {	
		startApp();
		
	}
	
	static void startApp () {
		Scanner input = new Scanner(System.in);
		Pessoa p = new Pessoa ();
		Comida c = new Comida ();
		
		System.out.println("Informe o nome da Pessoa:");
		p.nome = input.nextLine();
		System.out.println("Informe o peso:");
		p.peso = input.nextDouble();
		input.nextLine();
		
		String op = null;
		double pesoComida = 0;
		
		do {
			System.out.println("Adicionar comidas? S/N");
			op = input.nextLine();
			
			if (op.equalsIgnoreCase("S")) {

				System.out.println("Informe a comida:");
				c.nome = input.nextLine();
				System.out.println("Informe o peso da comida:");
				c.peso = input.nextDouble();
				input.nextLine();
			}else {
				break;
			}

			pesoComida = pesoComida + c.peso;
			
		}while(true);
		
//		System.out.println(pesoComida);
		
		p.comer(p.peso, pesoComida);
		
		input.close();
	
	}
}
