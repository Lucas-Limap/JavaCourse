package oo.composicao;

public class AcessosCurso {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario ("Lucas");
		Funcionario f2 = new Funcionario ("Evaniele");
		Funcionario f3 = new Funcionario ("Sabrina");
		
		
		Acessos c1 = new Acessos ("Wpp");
		Acessos c2 = new Acessos ("Instagram");
		Acessos c3 = new Acessos ("Facebook");
		
		
		c1.addFuncionario(f1);
		c1.addFuncionario(f2);
		c1.addFuncionario(f3);
		
		c2.addFuncionario(f2);
		c2.addFuncionario(f3);
		
		f3.addAcesso(c3);
		
		for(Funcionario func: c1.funcionarios ) {
			System.out.println("Usuarios:" + func.nomeF);
			System.out.println("Acesso: " + c1.nomeA);
		}
		
		System.out.println("\n" + f1.acessos.get(0).funcionarios);
		
		Acessos acessoEncontrado = f1.acessoProcurado("Wpp");
		
		if (acessoEncontrado != null) {
			System.out.println(acessoEncontrado.funcionarios);
		}
		
	}

}
