package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	void addItens (Produto produto, int quantidade){
			this.itens.add(new Item(produto, quantidade));
	}
	
	void addItens (String nome, double valor, int quantidade) {
		this.itens.add(new Item(new Produto(nome, valor), quantidade));
	}
	
	double obterValorItens () {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtdItem * item.produto.valorProduto;
		}
		
		return total;
	}
}
