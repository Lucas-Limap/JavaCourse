package oo.composicao;

public class ComputadorTeste {
	public static void main(String[] args) {
		
		Computador c1 = new Computador ();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		c1.iniciarProgramas();
		c1.iniciarProgramas();
		c1.iniciarProgramas();
		c1.iniciarProgramas();
		
		System.out.println(c1.memoria.usoMemoria);
		
		c1.fecharPrograma();
		c1.fecharPrograma();
		c1.fecharPrograma();
		c1.fecharPrograma();
		c1.fecharPrograma();
		
		System.out.println(c1.memoria.usoMemoria);
		
		
		
	}

}
