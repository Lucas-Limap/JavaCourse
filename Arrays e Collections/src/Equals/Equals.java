package Equals;

//import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario ();
		u1.nome = "Lucas de Lima";
		u1.email = "Lukaslimap@gmail.com";
		
		Usuario u2 = new Usuario ();
		u2.nome = "Lucas de Lima";
		u2.email = "Lukaslimap@gmail.com";
		
		
		System.out.println(u1 == u2); //FALSE
		System.out.println(u1.equals(u2)); //TRUE - LOGICA FEITA NA CLASS USUARIO
		//System.out.println(u1.equals(new Date())); // FALSE DATE NÃO PERTENCE A CLASS USUARIO
			
	}

}
