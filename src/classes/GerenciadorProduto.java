package classes;

import java.util.ArrayList;

public class GerenciadorProduto {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public GerenciadorProduto()	{
		//TODO: Popular com dados reais
		this.produtos.add(new Produto(1, "DVD - Frozen, uma aventura congelante", "15/06/2014", "Promoção válida somente para compras com dinheiro", 35.95, 25.95,
				"RJ", "Produtos", true));
		this.produtos.add(new Produto(2, "Viagem para Arraial do Cabo", "12/06/2014", "Promoção válida somente para os finais de semana", 800.00, 500.00, 
				"RJ", "Viagem", false));	
		this.produtos.add(new Produto(3, "Peça Teatral - O Gogó do Paulinho", "21/06/2014", "Válido somente para os 100 primeiros pagantes", 30.99, 15.50, 
				"RJ", "Diversao", false));
		this.produtos.add(new Produto(4, "Brozeamento Artificial", "18/06/2014", "Brozeamento é na MyCat. Promoção válida somente para compras com dinheiro", 50.45, 40.45, 
				"SP", "Estetica", true));
		this.produtos.add(new Produto(5, "Hopi-Hari", "28/06/2014", "Promoção válida somente para os finais de semana", 80.00, 50.00, 
				"SP", "Diversao", false));	
		this.produtos.add(new Produto(6, "Costela no Bafo do Gaúcho de Sampa", "25/06/2014", "Válido somente para os 100 primeiros pagantes", 30.99, 15.50, 
				"SP", "Produtos", false));
		this.produtos.add(new Produto(7, "Tattoo Show", "18/06/2014", "Faça a sua Primeira Tattoo.Promoção válida somente para compras com dinheiro", 60.45, 30.45, 
				"ES", "Estetica", false));
		this.produtos.add(new Produto(8, "Boate Le Blanc", "28/06/2014", "Promoção válida somente para os finais de semana e sem direito a acompanhantes.", 50.00, 30.00, 
				"ES", "Diversao", true));	
		this.produtos.add(new Produto(9, "IPhone 4s", "02/07/2014", "Válido somente para os 100 primeiros pagantes", 1450.00, 1205.50, 
				"ES", "Produtos", false));
		this.produtos.add(new Produto(10, "Sitio Barrocas", "03/07/2014", "Venha se divertir com a sua familia. Promoção válida somente para compras com dinheiro", 70.00, 50.00, 
				"MG", "Viagem", true));
		this.produtos.add(new Produto(11, "Boate Mato Alto", "28/07/2014", "Promoção válida somente para os finais de semana e sem direito a acompanhantes.", 50.00, 30.00, 
				"MG", "Diversao", false));	
		this.produtos.add(new Produto(12, "Livro - Walking Dead", "02/08/2014", "Válido somente para os 100 primeiros pagantes", 35.00, 25.50, 
				"MG", "Produtos", false));
		this.produtos.add(new Produto(13, "Depilação a Laser", "15/07/2014", "Promoção válida somente para compras com dinheiro", 70.00, 50.00, 
				"SC", "Estetica", false));
		this.produtos.add(new Produto(14, "Eco-Adventure", "28/07/2014", "Curta um fim de semana de aventura com a sua familia. Promoção válida somente para os finais de semana e sem direito a acompanhantes.", 80.00, 65.00, 
				"SC", "Diversao", true));	
		this.produtos.add(new Produto(15, "Livro - Harry Potter", "17/07/2014", "Válido somente para os 100 primeiros pagantes", 60.00, 45.50, 
				"SC", "Produtos", false));
		this.produtos.add(new Produto(16, "Brozeamento Artificial", "24/07/2014", "Promoção válida somente para compras com dinheiro", 70.00, 50.00, 
				"RS", "Estetica", false));
		this.produtos.add(new Produto(17, "Sun's Club", "29/07/2014", "Curta um fim de semana de aventura com a sua familia. Promoção válida somente para os finais de semana e sem direito a acompanhantes.", 80.00, 65.00, 
				"RS","Diversao", true ));	
		this.produtos.add(new Produto(18, "CD - One Direction", "17/07/2014", "Válido somente para os 100 primeiros pagantes", 35.50, 25.50, 
				"RS", "Produtos", false));
		this.produtos.add(new Produto(19, "Sitio Jonasake", "24/07/2014", "Promoção válida somente para compras com dinheiro", 70.00, 50.00, 
				"PR", "Viagem", false));
		this.produtos.add(new Produto(20, "CD - Luan Santana", "30/07/2014", "Promoção válida somente para os finais de semana.", 30.00, 20.00, 
				"PR","Produtos", true ));	
		this.produtos.add(new Produto(21, "CD - Sambo", "17/07/2014", "Válido somente para os 100 primeiros pagantes", 35.50, 25.50, 
				"PR", "Produtos", false));
		this.produtos.add(new Produto(22, "Tour - Estádio Fonte Nova", "08/08/2014", "Promoção válida somente para compras com dinheiro", 35.00, 15.00, 
				"BA", "Diversao", true));
		this.produtos.add(new Produto(23, "CD - Ivete Sangalo", "30/07/2014", "Válido somente para os 100 primeiros pagantes.", 30.00, 20.00, 
				"BA","Produtos", false ));	
		this.produtos.add(new Produto(24, "Sobrancelha de Henna", "22/07/2014", "Válido somente para os 100 primeiros pagantes", 33.45, 22.50, 
				"BA", "Estetica", false));
		this.produtos.add(new Produto(25, "Tour - Rios e Nascentes", "03/09/2014", "Promoção válida somente para compras com dinheiro", 35.00, 15.00, 
				"AC", "Viagem", true));
		this.produtos.add(new Produto(26, "CD - Banda Calipso", "14/07/2014", "Válido somente para os 100 primeiros pagantes.", 27.50, 15.00, 
				"AL", "Produto", true));
		this.produtos.add(new Produto(27, "Rodizio - Comida Tipica", "26/06/2014", "Válido somente para os 100 primeiros pagantes.", 50.00, 45.00, 
				"AM", "Produto", true));
		this.produtos.add(new Produto(28, "Depilação - Cera Quente", "27/06/2014", "Válido somente clientes VIPs.", 50.00, 45.00, 
				"AP", "Estetica", true));
		this.produtos.add(new Produto(29, "Teatro - Os Trapalhões", "17/08/2014", "Promoção válida somente para final de semana e pagamento em dinheiro.", 45.00, 35.00, 
				"CE", "Diversao", true));
		this.produtos.add(new Produto(30, "Tour - Palacio do Planalto", "05/08/2014", "Promoção válida somente para final de semana.", 15.00, 10.00, 
				"DF", "Viagem", true));
		this.produtos.add(new Produto(31, "CD - Vitor & Leo Acústico", "03/07/2014", "Promoção válida somente para 100 primeiros pagantes.", 25.90, 20.00, 
				"GO", "Produto", true));
		this.produtos.add(new Produto(32, "Açai do Bonny", "03/08/2014", "Promoção válida somente para 400 primeiros pagantes.", 10.90, 8.50, 
				"MA", "Produto", true));
		this.produtos.add(new Produto(33, "Tour - Cidade de Bonito ", "03/09/2014", "Promoção válida somente aos finais de semana e para 100 primeiros pagantes.", 45.50, 33.20, 
				"MS", "Viagem", true));
		this.produtos.add(new Produto(34, "Chapada dos Guimarães ", "17/10/2014", "Promoção válida somente aos finais de semana.", 60.00, 50.00, 
				"MT", "Diversao", true));
		this.produtos.add(new Produto(35, "Bronzeamento Artificial", "22/06/2014", "Promoção válida somente 50 primeiros pagantes.", 60.00, 50.00, 
				"PA", "Estetica", true));
		this.produtos.add(new Produto(36, "Livro - O Diario de um banana", "09/06/2014", "Promoção válida somente para compras com dinheiro e 100 primeiros pagantes.", 30.50, 28.00, 
				"PB", "Produto", true));
		this.produtos.add(new Produto(37, "Livro - A vida e a arte de Gonzagão", "19/06/2014", "Promoção válida somente para finais de semana.", 24.50, 17.30, 
				"PE", "Produto", true));
		this.produtos.add(new Produto(38, "Serra da Capivara", "23/06/2014", "Promoção válida somente para compras com dinheiro.", 27.00, 19.90, 
				"PI", "Viagem", true));
		this.produtos.add(new Produto(39, "Parque Estadual Dunas de Natal", "29/06/2014", "Promoção válida somente para compras com dinheiro.", 13.00, 9.90, 
				"RN", "Diversao", true));
		this.produtos.add(new Produto(40, "Museu Geológico de Rondônia", "01/07/2014", "Promoção válida somente para as 100 primeiras compras.", 10.00, 5.50, 
				"RO", "Diversao", true));
		this.produtos.add(new Produto(41, "Livro - Fotografias de Roraima", "01/09/2014", "Promoção válida somente para as 100 primeiras compras.", 48.90, 45.50, 
				"RR", "Produto", true));
		this.produtos.add(new Produto(42, "Teatro - Musical Caleidoscópio", "13/10/2014", "Promoção válida somente para as 20 primeiras compras e espetaculos do final de semana.", 23.10, 18.50, 
				"SE", "Diversao", true));
		this.produtos.add(new Produto(43, "Cidade de Palmas", "09/08/2014", "Promoção válida somente para os finais de semana.", 17.90, 10.90, 
				"TO", "Viagem", true));
		
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
			if (p.getNome().contains(nome))
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
			if ((p.getNome().contains(nome)) && (p.getEstado().equalsIgnoreCase(estado)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNomeCategoria(String nome, String categoria) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getNome().contains(nome)) && (p.getCategoria().equalsIgnoreCase(categoria)))
    			resultadoBusca.add(p);
    	}
		return resultadoBusca;		
	}

	public ArrayList<Produto> buscaNomeCategoriaEstado(String nome, String categoria,
			String estado) {
		ArrayList<Produto> resultadoBusca = new ArrayList<>();
		for(Produto p : this.produtos){
			if ((p.getNome().contains(nome)) && (p.getCategoria().equalsIgnoreCase(categoria)) && (p.getEstado().equalsIgnoreCase(estado)))
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
