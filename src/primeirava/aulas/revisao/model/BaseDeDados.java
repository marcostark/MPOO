package primeirava.aulas.revisao.model;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {
	
	List<Conta> contas = new ArrayList<>();
	
	public void cadastrar(Conta conta) {
		contas.add(conta);
	}
	
	public void buscar() {}
	
	public void remover() {}
	
	public void editar() {}
	
	public ArrayList<Conta> buscarTodos() {
		
		ArrayList<Conta> listaContas = new ArrayList<>();
		for(Conta c:contas) {
			listaContas.add(c);
		}
		return listaContas;
	}

}
