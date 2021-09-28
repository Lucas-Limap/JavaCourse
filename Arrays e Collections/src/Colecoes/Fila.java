package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Lucas"); // RETORNA FALSE QUANDO CHEIA
		fila.offer("Sabrina"); // RETORNA EXCEÇÃO QUANDO CHEIA
		fila.add("Evaniele");
		
		
		System.out.println(fila.peek()); // RETORNA FALSE QUANDO VAZIA
		System.out.println(fila.element()); // RETORNA EXCEÇÃO QUANDO VAZIA
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
		System.out.println(fila.poll()); // RETORNA FALSE QUANDO VAZIA
		System.out.println(fila.remove()); // RETORNA EXCEÇÃO QUNADO VAZIA
		
	}

}
