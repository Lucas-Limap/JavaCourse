package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Acessos {
	
	String nomeA;
	
	List<Funcionario> funcionarios = new ArrayList<>();
	
	Acessos (String acesso){
		this.nomeA = acesso;
	}
	
	void addFuncionario (Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		funcionario.acessos.add(this);
		
	}
	
	
	
	

}
