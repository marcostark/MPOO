package primeiraVA.atividadesExtras.livraria;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;	
	private Autor autor;
	
	public Livro() {}
	
	public Livro(String nome, String descricao, double valor, String isbn,Autor autor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
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
	
	public void aplicarDescontoDe(double porcetagem) {
		this.valor -= this.valor * porcetagem;
	}
	
	
	void mostraDetalhes() {
		String msg = "Mostrando detalhes do livro";
		System.out.println(msg);
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("ISBN: " + this.getIsbn());
		System.out.println();
		this.autor.mostrarDetalhes();
	}
	
}
