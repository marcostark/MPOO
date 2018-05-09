package primeirava.exercicios.exe1;
import javax.swing.JOptionPane;

public class AppTwo {

	public static void main(String[] args) {
		
		boolean senha = false;
		boolean email = false;
		System.out.println("Executando programa externo...");

		if(args[0].equals("marcos@jarvis.ia") && args[1].equals("123456"))
			{
				email = true;			
				senha = true;	
			}
		
		valida(email,senha);		
	}
	
	static void valida(boolean email,boolean senha){
		if(email && senha){
			JOptionPane.showMessageDialog(null, ("Executando conexão... Por favor Aguarde!!"));						
		}
		else 
		{
			JOptionPane.showMessageDialog(null, ("Dados Inválidos!"));						
		}
	}
}
