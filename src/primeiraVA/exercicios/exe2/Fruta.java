package primeiraVA.exercicios.exe2;

public class Fruta {
	
	private String nome;
	private int caroco;
	private boolean casca;
	private boolean climaterica;
	
	public Fruta() {}
	
	public Fruta(String nome, int caroco, boolean casca, boolean climaterica) {
		super();
		this.nome = nome;
		this.caroco = caroco;
		this.casca = casca;
		this.climaterica = climaterica;
	}
	public String getNome() {
		return nome;
	}
	
	public int getCaroco() {
		return caroco;
	}
	
	public void setCaroco(int caroco) {
		this.caroco = caroco;
	}
	
	public boolean isCasca() {
		return casca;
	}
	
	public void setCasca(boolean casca) {
		this.casca = casca;
	}	
	
	public boolean isClimaterica() {
		return climaterica;
	}

	public void setClimaterica(boolean climaterica) {
		this.climaterica = climaterica;
	}	
}
