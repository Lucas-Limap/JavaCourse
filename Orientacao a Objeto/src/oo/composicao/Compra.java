package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String cliente;
	List<Item> itens = new ArrayList<> ();
	
	void adicionarItem (String nome, int qtd, double preco) {
		itens.add(new Item(nome, qtd, preco));
	}
	
	double getValorTotal () {
		double total = 0;
		
		for(Item item : itens) {
			total += item.qtd * item.preco;
		}
		
		return total;
	}
	

}
