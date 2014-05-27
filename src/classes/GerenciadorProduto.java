package classes;

import java.util.ArrayList;

public class GerenciadorProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public GerenciadorProduto(){
		//TODO: Popular com dados reais
		this.produtos.add(new Produto("nome", "data", "condições", 0.0, 0.0, 
				"estado", "categoria"));
		this.produtos.add(new Produto("nome", "data", "condições", 0.0, 0.0, 
				"estado", "categoria"));		
	}
}
