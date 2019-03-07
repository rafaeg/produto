package br.com.empresa.Dao;

import java.util.List;

import br.com.empresa.Model.Produto;;

public interface IProdutoDao {
	
	public void salvarProduto(Produto produto);
	
	public void alterarProduto(Produto produto);
	
	public List<Produto> getListProdutos();
	
	public void delete(int id);
	
	public List<Produto> getProduto(int id);
	
}	
