package br.com.empresa.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.empresa.DaoImpl.CategoriaDaoImpl;
import br.com.empresa.Model.Categoria;

@Path("categoria")
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaService{
		
	@Inject
	private CategoriaDaoImpl categoriaDao = new CategoriaDaoImpl();
	
	@GET
	@Path("/listar")	
	public List<Categoria> getListaCategorias(){
		return categoriaDao.getListCategorias();
	}
	
	
	@POST
	@Path("/salvar")
	public void salvarCategoria(Categoria categoria) {
		categoriaDao.salvarCategoria(categoria);
	}
	
	@POST
	@Path("/alterar")
	public void alterarCategoria(Categoria categoria) {
		categoriaDao.alterarCategoria(categoria);
	}
	
}
