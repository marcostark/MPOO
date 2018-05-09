package primeirava.atividadesextras.livraria.teste;

import primeirava.atividadesextras.livraria.Autor;
import primeirava.atividadesextras.livraria.produtos.Ebook;
import primeirava.atividadesextras.livraria.produtos.Livro;
import primeirava.atividadesextras.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
	
	Autor autor = new Autor("Rodrigo Turini", "rodrigo.turini@caelum.com.br","123.123.123-12");	
		
	LivroFisico livro = new LivroFisico(autor);
	livro.setNome("Java 8 Prático");
	livro.setDescricao("Novos Recursos da lingguagem");
	livro.setValor(59.90);
	livro.setIsbn("978-85-66250-46-6");
	
	livro.aplicarDescontoDe(0.30);
	livro.mostraDetalhes();
	
	Autor outroAutor = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br","123.123.123-12");
	
	Livro outroLivro = new LivroFisico(outroAutor);
	outroLivro.setNome("Lógica de programação");
	outroLivro.setDescricao( "Crie seus primeiros programas");
	outroLivro.setValor(59.90);
	outroLivro.setIsbn("978-85-66250-22-0");
	
	outroLivro.mostraDetalhes();
	
	Ebook ebook = new Ebook("Java 8 Pratico", "Lambdas Streams E os Novos Recursos da Linguagem", 59.90, "978-85-66250-22-0", outroAutor, true);
	ebook.aplicarDescontoDe(0.15);
	ebook.mostraDetalhes();
	
		
	}
}
