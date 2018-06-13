package primeirava.exercicios.extras._01;

public class ClasseFilha extends ClassePai{

	// Pode sobreescrever um atributo da classe pai, mudando o seu encapsulamento
	private int i = 2;
	
	public ClasseFilha(int i) {
		super(i);

	}

	// Na sobreescrita de um metodo é possivél mudar o encapsulamento, porém, não é possivél
	// dimiuir a visibilidade e sim aumentar.
	@Override
	public void metodo() {
		System.out.println("Filha");
	}
	
	
	
	
	public static void main(String[] args) {
		
		//new ClasseFilha().metodo();		
	}
	
}
