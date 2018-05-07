package primeiraVA.exercicios.exe2;

import primeiraVA.aulas.mercadinho.Usuario;

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
	public void setNome(String nome) {
		this.nome = nome;
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

	public boolean tirarCaroco() {
		if(this.isCasca() == false) {
		
			while(this.getCaroco() > 0) {
				System.out.println("Tirando caroco n° " + this.getCaroco());
				this.caroco -= 1;			
			}
		} else {
			System.out.println("É necessario descascar a fruta antes!");
			return false;
		}
		return true;
	}
	
	public boolean descascar() {
		System.out.println("Descascando fruta");
		this.setCasca(false);
		return true;
	}
	
	// Liberar memoria com o garbage coletor
	public static void destroyer(Fruta fruta) {
		fruta = null;
		System.gc();
	}

}
