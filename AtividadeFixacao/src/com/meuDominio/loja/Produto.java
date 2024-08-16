package com.meuDominio.loja;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade = 0;
	
	public void Produto() {
	}
	public void Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setstring(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome do produto" + nome);
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade em estoque: " + quantidade);
	}
	
	public void comprar(int quantidadeComprar) {
		if (quantidadeComprar <= quantidade) {
			quantidade -= quantidadeComprar;
			System.out.println("Compra realizada com sucesso! Quantidade restante: " + quantidade);
		} else {
			System.out.println("Qauntidade insuficiente em estoque!");
		}
	}
	
	public void adicionarEstoque(int quantidadeAdicional) {
		quantidade += quantidadeAdicional;
	}
}
