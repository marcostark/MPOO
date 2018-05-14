package primeirava.exercicios.exe3;

public class App {
	
	public static void main(String[] args) {
		
	SerHumano homem = new SerHumano("Marcos");
	homem.falar();
	homem.andar();
	
	Cachorro cachorro = new Cachorro("Zeus");
	cachorro.emitirSom();
	cachorro.andar();
		
		
	}

}
