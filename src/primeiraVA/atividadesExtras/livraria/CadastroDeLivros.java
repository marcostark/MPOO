package primeiraVA.atividadesExtras.livraria;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
	
	Autor autor = new Autor("Rodrigo Turini", "rodrigo.turini@caelum.com.br","123.123.123-12");	
		
	Livro livro = new Livro("Java 8 Prático", "Novos Recursos da lingguagem", 59.90, "978-85-66250-46-6", autor);
	livro.aplicarDescontoDe(0.1);
	livro.mostraDetalhes();
	
	Autor outroAutor = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br","123.123.123-12");
	
	Livro outroLivro = new Livro("Lógica de programação", "Crie seus primeiros programas", 59.90, "978-85-66250-22-0", outroAutor);
	outroLivro.mostraDetalhes();
		
	}
}
