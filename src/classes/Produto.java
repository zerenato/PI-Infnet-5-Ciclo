package classes;

public class Produto {
	private int id;
	private String nome;
	private String dataLimite; //duração
	private String condicoes;
	private Double precoDe;
	private Double precoPor;
	private String estado;
	private String categoria;
	private boolean destaque;
	
	public Produto(int id, String nome, String dataLimite, String condicoes, Double precoDe, Double precoPor, String estado, String categoria, boolean destaque){
		this.id = id;
		this.nome = nome;
		this.dataLimite = dataLimite;
		this.condicoes = condicoes;
		this.estado = estado;
		this.categoria = categoria;
		this.precoDe = precoDe;
		this.precoPor = precoPor;
		this.destaque = destaque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}

	public String getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}

	public Double getPrecoDe() {
		return precoDe;
	}

	public void setPrecoDe(Double precoDe) {
		this.precoDe = precoDe;
	}

	public Double getPrecoPor() {
		return precoPor;
	}

	public void setPrecoPor(Double precoPor) {
		this.precoPor = precoPor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}
	
	
}
