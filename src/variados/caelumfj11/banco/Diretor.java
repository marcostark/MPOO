package variados.caelumfj11.banco;

public class Diretor extends Funcionario implements Autenticavel{
	
	@Override
	public double getBonificacao() {
		return 0;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
