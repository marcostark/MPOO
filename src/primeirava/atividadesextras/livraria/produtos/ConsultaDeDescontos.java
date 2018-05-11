package primeirava.atividadesextras.livraria.produtos;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciandorDeCupons gerenciador = new GerenciandorDeCupons();
		
		if(gerenciador.validaCupom("CUP158")) {
			System.out.println("Cupom de desconto valido");
		} else {
			System.out.println("Cupom de desconto invalido");
		}
		
	}
}
