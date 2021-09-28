package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	final String nomeF;
	
	final List<Acessos> acessos = new ArrayList<>();
	
	Funcionario(String nome){
		this.nomeF = nome;
	}
	
	void addAcesso (Acessos acesso) {
		this.acessos.add(acesso);
		acesso.funcionarios.add(this);
		
	}
	
	Acessos acessoProcurado (String nome) {
		for(Acessos acesso: this.acessos) {
			if(acesso.nomeA.equalsIgnoreCase(nome)) {
				return acesso;
			}
		}
		
		return null;
		
	}
	
	public String toString () {
		return nomeF;
	}
	

}
