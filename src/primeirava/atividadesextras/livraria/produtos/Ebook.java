package primeirava.atividadesextras.livraria.produtos;

import primeirava.atividadesextras.livraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	
	public Ebook() {}
	
	public Ebook(String nome, String descricao, double valor, String isbn,Autor autor, boolean impresso) {
		super(nome, descricao, valor, isbn, autor, impresso);		
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public boolean aplicarDescontoDe(double porcetagem) {
		if(porcetagem > 0.15) {
			return false;
		}
		/* Usar os metodos de acesso da classe pai, para garantir o 
		 * encapsulamento. 
		 *  */
		double desconto = this.getValor() * porcetagem;
		this.setValor((this.getValor() - desconto));
		return true;
	}
	
	/* Uma opção seria chamar o metodo aplicarDescontosDe da classe pai
	 * por meio da palavra super. Assim não seria necessario reescrever
	 * toda a logica do metodo novamente.
	 * 
	 * @Override
		public boolean aplicarDescontoDe(double porcetagem) {
		if(porcetagem > 0.15) {
			return false;
		}
		return super.aplicarDescontoDe(porcetamge);
	}*/
	
	

}
