package classes;

import java.util.ArrayList;

public class GerenciadorProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public GerenciadorProduto(){
		//TODO: Popular com dados reais
		this.produtos.add(new Produto(1, "produto a", "data", "condições", 1.0, 1.0, 
				"estado", "categoria", true));
		this.produtos.add(new Produto(2, "produto b", "data", "condições", 2.0, 2.0, 
				"estado", "categoria", false));	
		this.produtos.add(new Produto(3, "produto c", "data", "condições", 10.0, 6.0, 
				"estado", "categoria", true));
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public ArrayList<Produto> buscaEstado(String estado) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if (p.getEstado().equalsIgnoreCase(estado))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;
	}

	public ArrayList<Produto> buscaCategoria(String categoria) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if (p.getCategoria().equalsIgnoreCase(categoria))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNome(String nome) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if (p.getNome().equalsIgnoreCase(nome))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaCategoriaEstado(String categoria, String estado) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getCategoria().equalsIgnoreCase(categoria)) && (p.getEstado().equalsIgnoreCase(estado)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNomeEstado(String nome, String estado) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getNome().equalsIgnoreCase(nome)) && (p.getEstado().equalsIgnoreCase(estado)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNomeCategoria(String nome, String categoria) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getNome().equalsIgnoreCase(nome)) && (p.getCategoria().equalsIgnoreCase(categoria)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNomeCategoriaEstado(String nome, String categoria,
			String estado) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getNome().equalsIgnoreCase(nome)) && (p.getCategoria().equalsIgnoreCase(categoria)) && (p.getEstado().equalsIgnoreCase(estado)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaDestaque() {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for (Produto p : this.produtos) {
			if (p.isDestaque())
				resultadoBusca.add(p);
		}
		return resultadoBusca;
	}
}
