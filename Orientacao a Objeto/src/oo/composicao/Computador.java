package oo.composicao;

public class Computador {
	
	Memoria memoria = new Memoria ();
	
	void iniciarProgramas () {
		memoria.usoMemoria += 0.5;
		
	}
	
	void fecharPrograma () {
		memoria.usoMemoria -= 0.5;
		
	}void ligar (){
		memoria.ligado = true;
		
	}void desligar (){
		memoria.ligado = false;
		
	}boolean estaLigado(){
		return memoria.ligado;
	}

}
