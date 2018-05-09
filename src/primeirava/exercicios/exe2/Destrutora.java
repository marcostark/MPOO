package primeirava.exercicios.exe2;

public class Destrutora {
	
	public static void destroyer(Object obj) {
		// Antes de destruir pode ser executado outros comportamentos
		obj = null;
		System.gc();
	}
	
}
