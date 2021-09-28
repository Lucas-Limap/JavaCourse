package Herenca;

public class Jogador {

	int vida = 100;
	int x;
	int y;

		boolean atacar(Jogador oponente) {
	
			int deltaX = Math.abs(x - oponente.x);
			int deltaY = Math.abs(y - oponente.y);
	
			if (deltaX == 0 && deltaY == 1) {
				oponente.vida -= 10;
				return true;
			} else if (deltaX == 1 && deltaY == 0) {
				oponente.vida -= 10;
				return true;
			} else {
				return false;
			}
	
		}

	boolean andar(Direcao direcao) {

		if (direcao.equals(Direcao.NORTE)) {
			y++;
		} else if (direcao.equals(Direcao.LESTE)) {
			x++;
		} else if (direcao.equals(Direcao.SUL)) {
			if (y > 0) {
				y--;
			}else {
				System.out.println("Movimento inválido");
			}
		} else if (direcao.equals(Direcao.OESTE)) {
			if (x > 0) {
				x--;
			}else {
				System.out.println("Movimento inválido");
			}
		}

		return true;
	}

}
