package ClassesMetodos;

public class Pessoa {
	
	String nome;
	double peso;
	
	public void comer (double pesoP, double pesoC) {
		double total = pesoP + pesoC;
		System.out.printf("%s est� pesando %.3f", nome, total);
	}

}
