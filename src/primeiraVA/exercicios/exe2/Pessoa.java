package primeiraVA.exercicios.exe2;

public class Pessoa {
	
	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public void retirarCarocoFruta(Fruta fruta) {
			while(fruta.getCaroco() > 0) {
					System.out.println("Tirando caroco n° " + fruta.getCaroco());
					fruta.setCaroco(fruta.getCaroco()- 1);			
			}			
	}
	
	public boolean descascarFruta(Fruta fruta) {
		// Será executado apenas se a fruta tiver casca
		if(fruta.isCasca()) {
			System.out.println("Descascando fruta");
			fruta.setCasca(false);
		}
		return true;
	}
	
	// A verificação é necessaria para não ter que executar todo o metodo novamente
	public void comerFruta(Fruta fruta) {
		if (fruta.isCasca()) {
			this.descascarFruta(fruta);
		}
		if(fruta.getCaroco() > 0) {
			this.retirarCarocoFruta(fruta);
		}
	}
	
}
