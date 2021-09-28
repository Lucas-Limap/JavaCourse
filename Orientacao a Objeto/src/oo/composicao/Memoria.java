package oo.composicao;

public class Memoria {
	
	boolean ligado = false;
	double usoMemoria = 0.5 ;
	
	int memoriaUsada () {
		if(ligado != false) {
			return (int) Math.round(usoMemoria - 8);			
		}else {
			return 0;
		}
		
		
	}
	
	

}
