package primeirava.aulas.revisao.app;

import java.util.ArrayList;
import java.util.List;

import primeirava.aulas.revisao.controller.BancoController;
import primeirava.aulas.revisao.model.BaseDeDados;
import primeirava.aulas.revisao.model.Cliente;
import primeirava.aulas.revisao.model.Conta;
import primeirava.aulas.revisao.model.ContaCorrente;
import primeirava.aulas.revisao.model.ContaPoupanca;
import primeirava.aulas.revisao.view.Banco;

public class App {
	
	public static void main(String[] args) {
		
		
		List<Conta> contas = new ArrayList<>();
		BaseDeDados bd = new BaseDeDados();
				
		ContaCorrente cc = new ContaCorrente(0, 123456);
		bd.cadastrar(cc);
		Cliente cliente = new Cliente(cc,"ze", "000.000.000-00");
		
		ContaPoupanca cp = new ContaPoupanca(200, 1);
		bd.cadastrar(cp);
		cliente = new Cliente(cp,"Maria", "111.111.111-11");
		
		contas = bd.buscaConta();
		
		contas.forEach(
						c -> System.out.println("\nNome: "+ c.getCliente().getNome() + 
						"\nNumero: " + c.getNumero() + "\nCPF: " + 
						c.getCliente().getCpf() + 
						"\nSaldo: " + c.getSaldo()
						));				
				
		Banco banco = new Banco();
		BancoController bc = new BancoController(banco);
		bc.control();
		
	}
	
	// QUESTIONAMENTO 4: Validar CPF
	
	// QUESTIONAMENTO 5: Se dv pode ser 1 ou 51, como fica a manipulação do saldo
	// O dv identifica a poupanca, cada dv possui seu proprio saldo.
	// sacar e depositar no dv 1 é diferente de mexer no saldo de dv 51.
	
	// QUESTIONAMENTO 6: UML usar arraylist para Cliente
	// QUESTIONAMENTO 7: Trocar a composição entre cliente e conta. Usar arraylist
	// QUESIONAMENTO 8: Criar numero dinamico para criação de conta (Usar atributo statico)
	
	/* FAZER TELA
	 * 
	 * 
	 * conta a
	 * 	numero: textfield
	 * 	saldo
	 * 
	 * conta (destino)
	 * 	numero
	 * 	saldo (não editavel)
	 * 
	 * Dar a possibilidade de escolher entre corrente e poupanca
	 * 
	 * 
	 * 
	 */
	

}
