package ClassesMetodosCorrecao;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	
	}
	public void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
			
		}
		
	}public String Apresentar (){
		return "Ol� eu sou o " + nome + " e meu peso � " + peso + "kg.";
	}

}
