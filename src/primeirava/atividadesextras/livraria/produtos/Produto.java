package primeirava.atividadesextras.livraria.produtos;

/*
 * Como Produto é uma interface, ele herdará as obrigações da 
 * interface "Comparable". As classes que implementam "Produto"
 * possuem a obrigação de implementar o metodo "compareTo"
 * */
public interface Produto extends Comparable<Produto>{
	
	/*
	 * Uso do modificador é abstract, uma vez que todo metodo
	 * sem corpo de uma interface é abstrato. O uso de public
	 * também é opcional, uma vez que seus métodos são públicos
	 * por padrão.
	 *  */
	
	double getValor();

}
