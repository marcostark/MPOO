package primeirava.exercicios.exe5.composicaocorpohumano;

public class TransmutacaoHumana {
	
	public static void main(String[] args) {
		
		Corpo corpo = new Corpo(5.0);
		
//		Perna pernaDireita = new Perna(2.0);
//		Perna pernaEsquerda = new Perna(1.5);
//		
//		Pe peDireito = new Pe(2.0, pernaDireita);
//		Pe peEsquerdo = new Pe(1.5, pernaEsquerda);
//		
//		Dedo dedoPeDireito = new Dedo(0.1,peDireito);
//		Dedo dedoPeEsquerdo = new Dedo(0.15,peEsquerdo);
		
		Braco braco = new Braco(2.0, corpo);
//		Braco bracoEsquerdo = new Braco(1.5);
		
		Mao mao = new Mao(2.0, braco);
//		Mao maoEsquerda = new Mao(1.5, bracoEsquerdo);
		
		Dedo dedo = new Dedo(0.1, mao);
//		Dedo dedoMaoEsquerda = new Dedo(0.15, maoEsquerda, bracoEsquerdo);
		
		
		
		System.out.println("Corpo Humano" + ""
				+ "\n\nLado Direito"
				+ "\nCorpo: " +corpo.peso + ""
				+ "\nBraco: " +corpo.braco.peso + ""
				+ "\nMão: " + corpo.braco.mao.peso + ""
				+ "\nDedo: " + mao.dedo.peso + ""
				
//				+ "\nPerna: " +pernaDireita.peso + ""
//				+ "\nPé: " +pernaDireita.peDireito.peso + ""
//				+ "\nDedos: " +peDireito.dedo.peso + ""				
				
//				+ "\n\nLado Esquerdo"
//				+ "\nBraco: " +bracoEsquerdo.peso + ""
//				+ "\nMão: " + bracoEsquerdo.mao.peso + ""
//				+ "\nDedo: " + maoEsquerda.dedo.peso
				
//				+ "\nPerna: " +pernaEsquerda.peso + ""
//				+ "\nPé: " +pernaEsquerda.peEsquerdo.peso + ""
//				+ "\nDedos: " +peEsquerdo.dedo.peso + ""
						);	
		
	}
}
