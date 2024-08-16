package com.meuDominio.loja;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setstring("Banana");
		produto.setPreco(1.33);
		produto.adicionarEstoque(5);
		produto.comprar(2);
		produto.exibirInformacoes();
	}

}
