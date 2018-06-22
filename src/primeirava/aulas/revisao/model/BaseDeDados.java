package primeirava.aulas.revisao.model;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {
	
	List<Conta> contas = new ArrayList<>();
	
	public void cadastrar(Conta conta) {
		contas.add(conta);		
	}
	
	public Conta buscar(String numero) {
		
		for(Conta c: contas) {
			if(numero.equals(c.getNumero())) {
				return c;
			}
		}
		return null;		
	}
	
	public void remover(Conta conta) {}
	
	public void editar(Conta conta) {}
	
	public ArrayList<Conta>buscaConta() {
		ArrayList<Conta> listaContas = new ArrayList<>();
		for(Conta c: contas) {
			listaContas.add(c);
		}
		return listaContas;
	}

}
