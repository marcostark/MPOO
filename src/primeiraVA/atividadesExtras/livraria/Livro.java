package primeiraVA.atividadesExtras.livraria;

public abstract class Livro implements Produto{
	
	/*
	 * Uma classe abstrata não pode ser instanciada
	 * Não pode existir metodos abstratos em classes que não sejam abstratas
	 * Um classe abstrata pode ter metodos abstratos e concretos
	 * Toda classe filha da classe abstrata precisa implementar os metodos abstratos
	 * da classe pai, a menos que a mesma seja tambem abstrata.
	 * 
	 * */

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;	
	private Autor autor;
	private boolean impresso;
	
	public Livro() {}
	
	public Livro(String nome, String descricao, double valor, String isbn,Autor autor, boolean impresso) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		this.autor = autor;
		this.impresso = impresso;
	}
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
//	/* CAP 8
//	 * Metodo abstrato para obrigar a implementação do mesmo nas classes
//	 * filhas. P.S.: Apenas classes abstratas podem ter metodos abstratos.
//	 * */
//	public abstract boolean aplicarDescontoDe(double porcetagem);
	
	/***
	 * O This é usado para se referir ao atributo da classe
	 */	
	
	void mostraDetalhes() {
		String msg = "Mostrando detalhes do livro";
		System.out.println(msg);
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("ISBN: " + this.getIsbn());
		System.out.println();
		
		if (this.temAutor()){
			this.autor.mostrarDetalhes();
		}
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
}
