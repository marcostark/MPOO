package primeirava.exercicios.exe3;

public class SerHumano extends Animal implements Racional{

	public SerHumano(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void falar() {
		System.out.println("Falar");
	}
}
