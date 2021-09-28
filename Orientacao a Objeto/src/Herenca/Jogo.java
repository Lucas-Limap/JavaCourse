package Herenca;

public class Jogo {
	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.SUL);
//		j1.andar(Direcao.SUL);

//		System.out.println(j1.x);
//		System.out.println(j1.y);

		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Vida monstro: " + monstro.vida);
		System.out.println("Vida Heroi: " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida monstro: " + monstro.vida);
		System.out.println("Vida Heroi: " + heroi.vida);
		
	}

}
