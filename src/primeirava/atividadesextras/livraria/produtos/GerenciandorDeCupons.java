package primeirava.atividadesextras.livraria.produtos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GerenciandorDeCupons {
	
//	private List<String> cupons;	
//	private Set<String> cupons;
	private Map<String, Double> cupons;
	
	/*
	 * Trabalhar com List é ideal quando trabalhamos com intens internos
	 * que podem se repetir e sua ordem de alguma forma é importante. 
	 * Que não é o caso aqui. Em casos como esse será melhor usar 
	 * o "Set" (java.util.Set)
	 * */
	
	public GerenciandorDeCupons() {
		
		/* Simplificando o processo de adicionar dados ao ArrayList
		 * Ps.: Usando List*/
		
//		this.cupons = Arrays.asList(
//				"CUP74","CUP158","CUP14","CUP52","CUP221",
//				"CUP91","CUP327","CUP410","CUP275","CUP484",
//				"CUP207","CUP96","CUP119","CUP174","CUP291",
//				"CUP1","CUP115","CUP222","CUP272","CUP21"
//				);
		
		//Usando Set, programando voltado para a interface
//		this.cupons = new HashSet<String>();
//		
//		this.cupons.addAll(Arrays.asList(
//				"CUP74","CUP158","CUP14","CUP52","CUP221",
//				"CUP91","CUP327","CUP410","CUP275","CUP484",
//				"CUP207","CUP96","CUP119","CUP174","CUP291",
//				"CUP1","CUP115","CUP222","CUP272","CUP21"
//				));
		
		/*
		 * Nem List nem Set são as estruturas ideias para lidar com essa solução, 
		 * visto que cada cupom de desconto possui um valor agregado(valor do desconto),
		 * então decidiu-se usar a estruta chamada Map, que possui chaves e valores associados
		 * */
		this.cupons = new HashMap<>();
		cupons.put("CUP74",  10.0);
		cupons.put("CUP158", 12.0);
		cupons.put("CUP14",  13.0);
		cupons.put("CUP52",  14.0);
		
	}
	
	/*
	 * Metodo para validação de cupons de desconto
	 * retornará um o valor do desconto, caso a chave passada como 
	 * parametro exista
	 * 
	 * */
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
