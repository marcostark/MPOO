
package variados.caelumfj11.exercicios;

public class Porta {
	
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	private boolean aberta;
	
	public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	
	public void abrirPorta() {
		if(!aberta) {
			this.aberta = true;
			System.out.println("Abrindo porta...");
		} else {
			System.out.println("Porta já está aberta!");
		}
	}
	
	public void fecharPorta() {
		if(aberta) {
			this.aberta = false;
			System.out.println("Fechando porta");
		}else {
			System.out.println("Porta já está fechada!");
		}
	}
	
	public void pintarPorta(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Cor: " + this.cor
				+ "\nAltura: " + this.dimensaoX
				+ "\nLargura: " + this.dimensaoY;
	}

	// Getters and Setters
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public boolean isAberta() {
		return aberta;
	}
	
	public double getDimensaoX() {
		return dimensaoX;
	}
	
	public double getDimensaoY() {
		return dimensaoY;
	}
	
	public double getDimensaoZ() {
		return dimensaoZ;
	}

}
