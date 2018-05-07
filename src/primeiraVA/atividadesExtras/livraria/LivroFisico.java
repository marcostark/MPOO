package primeiraVA.atividadesExtras.livraria;

public class LivroFisico extends Livro{
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double porcetagem) {
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
