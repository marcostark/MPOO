package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		System.out.println("Imposto: " + cc.getValorImposto());
		
		Tributavel t = cc;
		System.out.println("Imposto (Interface): " + t.getValorImposto());
		
	}
}
