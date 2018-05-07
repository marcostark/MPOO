package primeiraVA.atividadesExtras.livraria;

public class CarrinhoDeCompras {
	
	private double  total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionado: " + livro.getNome());
		livro.aplicarDescontoDe(0.05);
		total += livro.getValor();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
