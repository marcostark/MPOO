package primeiraVA.exercicios.exe1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppOne {
	/***
	 * Para rodar no console é necessario (Caso esteja no workspace do eclipse)
	 * rodar de fora do pacote onde estão as classes
	 * Ex.:java ExecMainExterno/AppOne
	 * @throws IOException 
	 * 
	 * */
	public static void main(String[] args) throws InterruptedException, IOException{
		
		/***
		 * Irá executar o comando do programa externo, pegar o seu retorno
		 * e mostrar a saida.
		 */

		Process process = Runtime.getRuntime().exec("java AppTwo marcos@jarvis.ia 123456");  
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));  
		String line = null;  
		while ((line = br.readLine()) != null) {  
		     System.out.println(line);  
		}
	}
}
