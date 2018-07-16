package segundava.exercicios.movimentopersonagem;

public class Util {
	

	public static boolean trataColisao(Elemento a, Elemento b) {
		
		// Posição do eixo X + largura dos elementos
		final int posicaoLarguraA = a.x + a.largura;
		final int posicaoLarguraB = b.x + b.largura;
		
		// Posição do eixo y + altura dos elementos
		final int posicaoAlturaA = a.y + a.altura;
		final int posicaoAlturaB = b.y + b.altura;
		
		if(posicaoLarguraA > b.x && a.x < posicaoLarguraB 
				&& posicaoAlturaA > b.y && a.y < posicaoAlturaB) {
			return true;
		}

		return false;
	}
	
	
	

}
