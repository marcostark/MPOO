package primeirava.atividadesextras.livraria.teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerformace {
	
	public static void main(String[] args) {
		
		/*
		 * Trabalhar com List é ideal quando trabalhamos quando os itens 
		 * internos podem se repetir e sua ordem de alguma forma é importante. 
		 * Caso contrario pode-ser usar o "Set" (java.util.Set)
		 * 
		 * */
		
		List<String> colecao = new ArrayList<String>();		
		//Set<String> colecao = new HashSet<String>();		
		
		for(int i = 0; i < 100000; i++) {
			colecao.add("Item: " + i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			colecao.contains("Item: " + i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
	
		System.out.println("Demorou " + tempo + "MS para executar");		
		/* 
		 * Usando List: ArrayList -> Demorou 200325MS(3,3 min) para executar
		 * Usando Set:  HashSet   -> Demorou 69MS para executar		
		*/
		
	}

}
