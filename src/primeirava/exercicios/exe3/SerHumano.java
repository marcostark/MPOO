package primeirava.exercicios.exe3;

public class SerHumano extends Animal implements Racional{

	public SerHumano(String nome) {
		super(nome);
	}

	@Override
	public void falar() {
		System.out.println("Falar");
	}

	@Override
	public void andar() {
		System.out.println("Bipede");	
	}
}
