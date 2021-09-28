package oo.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra c1 = new Compra ();
		c1.addItens("lapis", 2.50, 5);
		c1.addItens("caneta", 5, 10);
		c1.addItens("caderno", 20, 2);
		
		Compra c2 = new Compra ();
		c2.addItens("laptop", 1500, 1);
		c2.addItens("tablet", 550, 1);
		c2.addItens("Impressora", 1000, 1);
		
		Cliente cliente = new Cliente ("Lucas");
		cliente.addCompra(c1);
		cliente.addCompra(c2);
		System.out.println(cliente.nome + " - valor do carrinho: R$ " + cliente.obterValorTotal());
		

	}

}
 