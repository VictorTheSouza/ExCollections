package br.victor.ExCollections;

public class Produto {
	
	private String produto;
	private int quantidade;
	
	public Produto(String produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "Produto:" + this.produto + " - " + "Quantidade " + this.quantidade + "\n";
	}
	
	
	
	

}
