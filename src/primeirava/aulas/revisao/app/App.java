package primeirava.aulas.revisao.app;

import java.util.ArrayList;

import primeirava.aulas.revisao.model.Cliente;
import primeirava.aulas.revisao.model.Conta;
import primeirava.aulas.revisao.model.ContaCorrente;
import primeirava.aulas.revisao.model.ContaPoupanca;

public class App {
	
	public static void main(String[] args) {
		
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(0, 123456);
		contas.add(cc);
		Cliente cliente = new Cliente(cc,"ze", "000.000.000-00");
		
		ContaPoupanca cp = new ContaPoupanca(2.0, 1);
		contas.add(cp);
		cliente = new Cliente(cp,"Maria", "111.111.111-11");
		
		for (Conta conta: contas) {
			System.out.println(conta.getCliente().getNome());
			System.out.println(conta.getSaldo());
		}
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
