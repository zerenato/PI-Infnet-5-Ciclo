package classes;

import java.util.ArrayList;

public class GerenciadorProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public GerenciadorProduto(){
		//TODO: Popular com dados reais
		this.produtos.add(new Produto(1, "produto a", "data", "condi��es", 1.0, 1.0, 
				"estado", "categoria", true));
		this.produtos.add(new Produto(2, "produto b", "data", "condi��es", 2.0, 2.0, 
				"estado", "categoria", false));		
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}
