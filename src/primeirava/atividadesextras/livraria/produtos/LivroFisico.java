package primeirava.atividadesextras.livraria.produtos;

import primeirava.atividadesextras.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public boolean aplicarDescontoDe(double porcetagem) {
		if(porcetagem > 0.3) {
			return false;
		} 
		double desconto = getValor() * porcetagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto em LivroFisico");
		return true;
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.15;
	}

}
