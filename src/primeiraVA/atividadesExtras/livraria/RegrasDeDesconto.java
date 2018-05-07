package primeiraVA.atividadesExtras.livraria;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);			
		
		System.out.println("Valor atual do livro: " + livro.getValor());
		
		if(!livro.aplicarDescontoDe(0.3)) {
			System.out.println("Não é permitido desconto maior que 30%");
		} else {
			System.out.println("Valor com desconto " + livro.getValor());
		}		
		
		Ebook ebook = new Ebook();
		ebook.setValor(29.90);
		ebook.setAutor(autor);
		
		if(!ebook.aplicarDescontoDe(0.15)) {
			System.out.println("Não é permitido desconto maior que 15%");
		} else {
			System.out.println("Valor com desconto " + ebook.getValor());
		}
			
		
	}
}
