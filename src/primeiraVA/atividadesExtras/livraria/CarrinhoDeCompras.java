package primeiraVA.atividadesExtras.livraria;

public class CarrinhoDeCompras {
	
	private double  total;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto);
		//produto.aplicarDescontoDe(0.05);
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
