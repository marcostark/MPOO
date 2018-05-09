package primeiraVA.exercicios.exe2;

public class ComerFruta {
	
	public static void Comer(Fruta fruta) {
	
		fruta.descascar();
		if (fruta.tirarCaroco() == true) {
			System.out.println("Comendo fruta! ");
			fruta.destroyer(fruta);
		}		
	}
}
