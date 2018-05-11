package primeirava.atividadesextras.livraria.produtos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import primeirava.atividadesextras.livraria.Autor;

public class OrdenandoComJava {
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
		
		List<Produto> produtos = Arrays.asList(livroFisico, ebook);
		
		Collections.sort(produtos);
		
		for(Produto produto:produtos) {
			System.out.println("Valor: " + produto.getValor());
		}
		
		
	}
}
