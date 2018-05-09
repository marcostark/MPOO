package primeirava.exercicios.exe2;

public class App {
	
	public static void main(String[] args) {
		
		//Fruta fruta = new Fruta("Banana",0, true, false);
		Pessoa pessoa = new Pessoa("Marcos");
		Fruta fruta = new Fruta("Banana",10, true, true);
		
		pessoa.comerFruta(fruta);
		Destrutora.destroyer(fruta);
	}
}
