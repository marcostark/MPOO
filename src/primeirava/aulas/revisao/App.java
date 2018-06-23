package primeirava.aulas.revisao;

public class App {
	
	public static void main(String[] args) {	
	
		Caixa caixa = new Funcionario();
		Gerente gerente = new Funcionario();
		SuperFuncionario sf = new Funcionario();
		
		System.out.println(caixa instanceof SuperFuncionario);
		
		//caixa.realizarVenda(p);
		
		}
}
