package primeirava.exercicios.exe5.agregacao;

public class Porta {
	
	private String cor;

	public Porta(String cor) {
		super();
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Porta (Cor): " + this.getCor();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
