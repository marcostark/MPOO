package variados.caelumfj11;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	
	public Data() {}
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano + ".";
	}

}
