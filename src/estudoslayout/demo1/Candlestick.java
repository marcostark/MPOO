package estudoslayout.demo1;

import java.util.Calendar;

public final class Candlestick {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		super();
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
	
	public boolean isAlta() {
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}
}
