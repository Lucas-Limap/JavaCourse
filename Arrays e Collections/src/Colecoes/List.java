package Colecoes;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList <>();
		
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Evaniele"));
		lista.add(new Usuario("Sabrina"));
		lista.add(new Usuario("Bob"));
		lista.add(new Usuario("Nayara"));
		lista.add(new Usuario("Hellen"));
		lista.add(new Usuario("Lima"));
		
		System.out.println(lista.get(3)); //SE CHAMAR PELO ID ELE PUXA PELO TOSTRING DENTRO DA CLASS
		
		for(Usuario u: lista) {
			System.out.println(u.nome); // SE CHAMAR DIRETO PELA VARIAVEL NÃO VEM O TOSTRING 
		}
		
		System.out.println(">>> " + lista.remove(5).nome); // 	TRAZ O NOME EXCLUIDO
		System.out.println(lista.remove(new Usuario ("Lima"))); // TRAZ TRUE E FALSE SE FOI REMOVIO 
		System.out.println(lista.contains(new Usuario ("Lucas"))); // CHECA SE EXISTE O ITEM NA LISTA, E TRAZ TRUE OU FALSE
		
	}

}
