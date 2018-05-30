package variados.caelumfj11.exercicios;

public class App {
	
	public static void main(String[] args) {
		
	/*
	Porta porta = new Porta("verniz", 1.80, 0.57, 0.05);
	
	porta.abrirPorta();
	porta.abrirPorta();
	porta.fecharPorta();
	porta.fecharPorta();
	System.out.println(porta.isAberta());
	
	porta.pintarPorta("Azul");
	System.out.println("-----------------");
	System.out.println(porta);
	
	porta.pintarPorta("Preta");
	System.out.println("-----------------");
	System.out.println(porta); */
	
	//////////////////////////////////////////////////////////////////q
	Porta p1 = new Porta("verniz", 1.80, 0.57, 0.05);
	Porta p2 = new Porta("verniz", 1.80, 0.57, 0.05);
	Porta p3 = new Porta("verniz", 1.80, 0.57, 0.05);
	
	Casa casa = new Casa("Branco", p1, p2,p3);
	casa.pintarCasa("Amarelo");
	casa.getPorta1().abrirPorta();
	casa.getPorta2().abrirPorta();
	//casa.getPorta3().abrirPorta();
	System.out.println(casa);
	
	}
}
