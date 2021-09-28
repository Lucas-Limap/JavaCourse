package Colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios =  new HashSet<> ();
		
		usuarios.add(new Usuario("Lucas"));
		usuarios.add(new Usuario("Evaniele"));
		usuarios.add(new Usuario("Sabrina"));
		usuarios.add(new Usuario("Nayara"));
		
		boolean resultado = usuarios.contains(new Usuario("Lucas"));
		System.out.println(resultado);
		
	}

}
