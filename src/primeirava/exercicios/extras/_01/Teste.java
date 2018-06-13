package primeirava.exercicios.extras._01;

public class Teste {
	
	//private String b; // Atributo deve ser static
	// static String a; // Tbm não pode ter o mesmo nome do parametro
	static String b;
	
	static void atualizar(String a) {
		b = a;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	
		Teste.atualizar("Marcos");
	}
}
