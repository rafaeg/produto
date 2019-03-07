package br.com.empresa.Dto;

public class ProdutoDto {
	
	private int id;
	private String codigoBarras;
	private String nome;
	private String descricao;
	private int quantidade;
	
	private int idCategoria;
	private String descricaoCategoria;
	
	
	public ProdutoDto(int id, 
					  String codigoBarras, 
					  String nome, 
					  String descricao, 
					  int quantidade, 
					  int idCategoria,
					  String descricaoCategoria) {
		this.id = id;
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.idCategoria = idCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	
	
	
	
}
