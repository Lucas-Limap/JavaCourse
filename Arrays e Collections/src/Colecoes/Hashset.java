package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Hashset {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Set<String> listahash = new HashSet<>();
		Set<String> listaTree = new TreeSet<>();
		listaTree.add("Lucas");
		listaTree.add("Eva");
		listaTree.add("Nayara");
		listaTree.add("Sabrina");
		listaTree.add("Hellen");
		listaTree.add("Ana");
		
		for (String nomes : listaTree ) {
			System.out.println(nomes);
		}
		
	}

}
