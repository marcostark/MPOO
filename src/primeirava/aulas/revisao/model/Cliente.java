package primeirava.aulas.revisao.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	
	/* Composição
	 * 
	 * Cliente não existe sem conta
	 */
	
	/* Comentar para restringir o acesso ao objeto
	 * Caso usar ArrayList é obrigatorio deixa-lo por causa do 
	 * CREATE do CRUD
	 */
	
	public Cliente(Conta conta) {}
	
	public Cliente(Conta conta, String nome, String cpf) {
		conta.getCliente().nome = nome;
		
		// Validar cpf: só criará
		// Metodo validarCPF return null (Ou exceção)
		conta.getCliente().cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
