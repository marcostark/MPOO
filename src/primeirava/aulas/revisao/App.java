package primeirava.aulas.revisao;

public class App {
	
	public static void main(String[] args) {	
	
		Produto p = new Produto();
		Caixa caixa = new Funcionario();
		Gerente gerente = new Funcionario();
		Funcionario sf = new Funcionario();
		
		System.out.println(caixa instanceof SuperFuncionario);
		
		caixa.realizarVenda(p);
		
		}
}
