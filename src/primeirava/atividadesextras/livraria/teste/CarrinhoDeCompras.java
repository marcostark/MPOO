package primeirava.atividadesextras.livraria.teste;

import primeirava.atividadesextras.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double  total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0; 
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto);
		this.produtos[contador] = produto;
		this.contador ++;
		//produto.aplicarDescontoDe(0.05);
		this.total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Produto[] getProdutos() {
		return produtos;
	}
	
	

}
