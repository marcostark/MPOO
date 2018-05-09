package primeirava.atividadesextras.livraria.teste;
public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		
		double soma = 0;
		
		for (int i = 0; i < 35; i++) {
			soma += 59.90;
		}
		
		if(soma < 150) {
			System.out.println("Estoque baixo: " + soma);
		} else if(soma >= 2000 ){
			System.out.println("Estoque muito baixo: " + soma);
		}else {
			System.out.println("Estoque OK! " + soma );
		}
				
		
	}
}
