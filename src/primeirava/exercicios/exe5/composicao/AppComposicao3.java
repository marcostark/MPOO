package primeirava.exercicios.exe5.composicao;

import java.util.ArrayList;
import java.util.List;

public class AppComposicao3 {
	
	// Veja que é possivél instanciar as partes sem o todo.
		
	public static void main(String[] args) {
	
		// Forçando o uso do todo no construtor das partes
		CarroComposicao3 carro = new CarroComposicao3("Camaro");
		
		// Essas partes serão descartadas após a criação completa do todo
		MotorComposicao3 motor = new MotorComposicao3(1.6, carro);
		
		PortaComposicao3 porta [] = new PortaComposicao3[5];
		String corPorta [] = {"Amarelo", "Amarelo","Amarelo","Amarelo","Amarelo"};
		
		for(int i = 0; i < porta.length; i++) {
			porta[i] = new PortaComposicao3(corPorta[i],i,carro);
		}
		
		List<String> saida = new ArrayList<String>();
		for(int i = 0; i < carro.porta.length; i++)
			saida.add(carro.porta[i].cor);
		
		System.out.println(carro + "\nPortas\n" + saida);
		
		// Não consegue ter acesso as partes
		
		
		
	}
}
