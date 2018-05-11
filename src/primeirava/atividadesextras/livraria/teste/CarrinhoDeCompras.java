package primeirava.atividadesextras.livraria.teste;

import java.util.List;
import java.util.ArrayList;

import primeirava.atividadesextras.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double  total;
	/* É uma boa pratica programar voltado para interface -> List (Pacote util) é a interface */ 
	private List<Produto> produtos;
	private int contador = 0; 
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto);
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	

}
