package primeirava.atividadesextras.livraria.produtos;

@FunctionalInterface
public interface Promocional {
	
	/*
	 * Interface funcional, permitido apenas um metodo abstrato
	 * default methods não influenciam 
	 * 
	 * */
	
	boolean aplicarDescontoDe(double porcetagem);
	
	
	/*
	 * Metodo concreto, onde as classes que implementam esta interface
	 * não precisam sobreescrever o metodo.*/
	default boolean aplicarDescontode10Porcento() {
		return aplicarDescontoDe(0.1);
	}

}
