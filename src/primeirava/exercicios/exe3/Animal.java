package primeirava.exercicios.exe3;

public abstract class Animal {
	
	public String nome;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}	
	public abstract void andar();
		
}
