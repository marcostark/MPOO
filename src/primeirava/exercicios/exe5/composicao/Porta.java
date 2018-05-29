package primeirava.exercicios.exe5.composicao;

public class Porta {
	
	private String cor;

	public Porta(String cor) {
		super();
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Porta (Cor): " + this.getCor();
	}


}
