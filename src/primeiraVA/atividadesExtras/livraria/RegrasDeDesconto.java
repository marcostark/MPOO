package primeiraVA.atividadesExtras.livraria;

public class RegrasDeDesconto {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setValor(59.90);			
		
		System.out.println("Valor atual do livro: " + livro.getValor());
		
		if(!livro.aplicarDescontoDe(0.31)) {
			System.out.println("Não é permitido desconto maior que 30%");
		} else {
			System.out.println("Valor com desconto " + livro.getValor());
		}		
		
	}
}
