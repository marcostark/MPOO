package primeirava.atividadesextras.livraria.produtos;

import primeirava.atividadesextras.livraria.Editora;

public class Revista implements Produto, Promocional{
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public boolean aplicarDescontoDe(double porcetagem) {
		if(porcetagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcetagem;
		setValor(getValor() - desconto);
		return true;
	}

}
