package br.com.empresa.Dao;

import java.util.List;

import br.com.empresa.Model.Categoria;

public interface ICategoriaDao {
	
	public void salvarCategoria(Categoria categoria);
	
	public void alterarCategoria(Categoria categoria);
	
	public List<Categoria> getListCategorias();
	
	public Categoria recuperarCategoria(int id);
	
}
