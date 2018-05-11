package primeirava.atividadesextras.livraria.produtos;

import java.util.Arrays;
import java.util.List;

public class GerenciandorDeCupons {
	
	private List<String> cupons;
	
	public GerenciandorDeCupons() {
		
		/* Simplificando o processo de adicionar dados ao ArrayList*/
		
		this.cupons = Arrays.asList(
				"CUP74","CUP158","CUP14","CUP52","CUP221",
				"CUP91","CUP327","CUP410","CUP275","CUP484",
				"CUP207","CUP96","CUP119","CUP174","CUP291",
				"CUP1","CUP115","CUP222","CUP272","CUP21"
				);
	}
	
	/*
	 * Metodo para validação de cupons de desconto
	 * retornará um boolean indicando se o cupom passado por parametro
	 * está presente ou não na lista
	 * */
	public boolean validaCupom(String cupom) {
		return this.cupons.contains(cupom);
	}

}
