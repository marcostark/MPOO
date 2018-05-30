package variados.caelumfj11.exercicios;

public class Casa {
	
	private String cor;
	private Porta porta1, porta2, porta3;
	
	public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
		super();
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}

	public String getCor() {
		return cor;
	}
	
	public void pintarCasa(String cor) {
		this.cor = cor;
	}
	
	// Implementar com array
	public int quantPortasAbertas() {
		int cont = 0;
		if(this.porta1.isAberta()) {
			cont++;
		}
		if (this.porta2.isAberta()) {
			cont++;
		}
		if(this.porta3.isAberta()) {
			cont++;
		}		
		return cont;
	}
	
	public Porta getPorta1() {
		return porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

	@Override
	public String toString() {
		return "Cor: " + this.cor
				+ "\nPorta abertas: " + this.quantPortasAbertas();
	}	

}
