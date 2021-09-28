package Colecoes;

import java.util.Deque;
import java.util.LinkedList;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new LinkedList<>();
		
		livros.add("Codigo limpo");
		livros.push("Código limpo 2");
		
			System.out.println(livros.peek());
			System.out.println(livros.element());
			
			System.out.println(livros.poll());
			System.out.println(livros.pop());
			System.out.println(livros.remove());
	}

}
