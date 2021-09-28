package oo.composicao;

import java.util.Scanner;

public class AcessosTeste {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		String op = "";
		do {
			System.out.printf("nome do funcionario: ");
			Funcionario f1 = new Funcionario (i.nextLine());
			
			System.out.printf("Add curso");
			Acessos a1 = new Acessos (i.nextLine());
			
			System.out.printf("Cadastrar novo funcionario: ");
			op = i.nextLine();
			
			if(op.equalsIgnoreCase("Sim")) {
				continue;
			}else {
				for(Funcionario func: a1.funcionarios) {
					System.out.println(func.nomeF);
				}
				break;
			}
			
			
		}while(true);
		
		i.close();
		
		//TODO FINALIZAR CODIGO
			//IMPLEMENTAR TOSTRING
		
	}

}

