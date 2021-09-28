package Colecoes;

import java.util.HashSet;

public class Hashset1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto1 = new HashSet ();
		
		conjunto1.add(1.2);
		conjunto1.add(1);
		conjunto1.add(true);
		conjunto1.add("Teste");
		conjunto1.add("X");
		
		System.out.println(conjunto1.size());
		System.out.println(conjunto1);
		
		System.out.println(conjunto1.remove("X"));
		System.out.println(conjunto1.remove("teste"));
		System.out.println(conjunto1.contains("X"));
		System.out.println(conjunto1.contains("Teste"));
	
		
		System.out.println(conjunto1.size());
		System.out.println(conjunto1);
		
		HashSet conjunto2 = new HashSet ();
		conjunto2.add(1);
		conjunto2.add(2);
		conjunto2.add(3);
		conjunto2.add(4);
		
		conjunto1.add(conjunto2);
		
		System.out.println(conjunto1);
		
		conjunto1.retainAll(conjunto2);
		System.out.println(conjunto1);
		
		conjunto1.clear();
		
	}

}
