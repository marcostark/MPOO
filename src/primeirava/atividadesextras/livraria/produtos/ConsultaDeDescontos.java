package primeirava.atividadesextras.livraria.produtos;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciandorDeCupons gerenciador = new GerenciandorDeCupons();
		
		Double desconto = gerenciador.validaCupom("CUP158");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto valido");
			System.out.println("Valor: " + desconto);
		} else {
			System.out.println("Cupom de desconto invalido");
		}
		
	}
}
