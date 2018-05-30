package variados.caelumfj11;

public class App {
	
	

	public static void main(String[] args) {
	
	Data data = new Data(30,05,2018);
	
	Cliente cliente1 = new Cliente("Marcos","Souza", "111.111.111-11");
	Cliente cliente2 = new Cliente("Patricia","Souza", "222.222.222-22");
		
	Conta c1 = new Conta(12345,"4444-4", cliente1, 0.0,data);
	Conta c2 = new Conta(12345,"2222-2", cliente2, 0.0,data);
	
	
	System.out.println(c1);
	c1.depositar(100);
	System.out.println(c1);
	
	if (c1.sacar(150)) {
		System.out.println("Saque efetuado com sucesso! Saldo: " + c1.getSaldo());
	} else {
		System.out.println("Saldo insuficiente! Saldo: " + c1.getSaldo());
	}
	
	System.out.println(c2);
	c1.transferePara(c2,10);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println("Rendimento c2: " + c1.calculaRendimento());
	
	// Metodo estatico da classe, não é necessario criar um objeto para acessar o mesmo
	System.out.println("Total de conta criadas: " + Conta.getTotalContasCriadas());
		
	}
}
