package primeirava.atividadesextras.livraria.teste;

import primeirava.atividadesextras.livraria.Autor;
import primeirava.atividadesextras.livraria.produtos.Ebook;
import primeirava.atividadesextras.livraria.produtos.LivroFisico;
import primeirava.atividadesextras.livraria.produtos.Produto;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Test-Driven Development");
		livroFisico.setValor(59.90);
		livroFisico.aplicarDescontode10Porcento();
		
		Ebook ebook = new Ebook();
		ebook.setAutor(autor);
		ebook.setNome("Test-Driven Development (Ebook)");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		Produto[] produtos = carrinho.getProdutos();
		
		try {
			for (Produto produto: produtos) {
				if (produto != null) {
				System.out.println(produto.getValor());
				}
			}
		}catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
	}
}
