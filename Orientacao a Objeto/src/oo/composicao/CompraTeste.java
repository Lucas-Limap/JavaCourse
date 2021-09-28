package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra ();
		c1.cliente = "Lucas";
		c1.itens.add(new Item ("Volante", 1, 150.00));
		c1.itens.add(new Item ("Pneu", 2, 350));
		c1.adicionarItem("Roda", 4, 450.00);
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}

}
