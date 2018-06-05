package primeirava.exercicios.exe5.composicaocorpohumano;

public class TransmutacaoHumana {
	
	public static void main(String[] args) {
		
		Corpo corpo = new Corpo();		
		Braco braco = new Braco(corpo);
				
		Mao mao = new Mao(braco);		
		Dedo dedo = new Dedo(mao,0.8);
		
		new Braco(braco, mao);
		
		Corpo cp = new Corpo(corpo, braco);
		
		System.out.println("Corpo: " + corpo.braco.mao.dedo.peso);	
	}
}
