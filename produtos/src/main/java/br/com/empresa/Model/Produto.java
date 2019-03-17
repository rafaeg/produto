package br.com.empresa.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="produto")
@XmlRootElement
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codigoBarras")
	private String codigoBarras;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	public Produto() {
		
	}
	
	public Produto(int id, 
				   String codigoBarras, 
				   String nome, 
				   String descricao, 
				   int quantidade, 
				   String nomeCategoria) {
		
		this.id = id;
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.categoria.setDescricao(nomeCategoria);
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoBarra() {
		return codigoBarras;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarras = codigoBarra;
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
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigoBarra=" + codigoBarras + ", nome=" + nome + ", descricao=" + descricao
				+ ", quantidade=" + quantidade + "]";

	}
}