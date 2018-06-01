package variados.caelumfj11.banco;

public class ControleDeBonificações {
	
	public double totalDeBonificacoes = 0;
	
	
	/* 
	 * O metodo que será invocado será o correspondente ao tipo do objeto
	 * ou seja, se for um Funcionario será invocado o metodo do funcionaro, 
	 * se for de alguma classe filha de Funcionario será invocado o seu método
	 * correspondente.
	 */
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}	

}
