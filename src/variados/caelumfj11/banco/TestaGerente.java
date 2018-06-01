package variados.caelumfj11.banco;

public class TestaGerente {
	
	public static void main(String[] args) {
		
		ControleDeBonificações controle = new ControleDeBonificações();

		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Souza");	
		secretaria.setSalario(1000);
		secretaria.setCpf("123.456.798.22");
		controle.registra(secretaria);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSenha(123);
		gerente.setSalario(5000);
		gerente.setCpf("111.222.333-44");
		gerente.setNumDeFuncionariosGerenciados(10);
		controle.registra(gerente);
		
		System.out.println(gerente);
		System.out.println(secretaria);
		System.out.println("\nTotal de Bonificações: " + controle.getTotalDeBonificacoes());
		
		
	}
}
