package br.com.empresa.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Application;

import br.com.empresa.DaoImpl.ProdutoDaoImpl;
import br.com.empresa.Model.Produto;


@Path("/produto")
@Produces(MediaType.APPLICATION_JSON)
//@Consumes("application/json")
public class ProdutoService {
	
	@Inject
	private ProdutoDaoImpl prodDaoImpl = new ProdutoDaoImpl();
	
	@POST
	@Path("/salvar")
	public void salvarProduto( Produto prod ) {
		prodDaoImpl.salvarProduto(prod);
	}
	
	@PUT
	@Path("/alterar")
	public void alterarProduto( Produto prod ) {
		prodDaoImpl.alterarProduto(prod);
	}
	
	@DELETE
	@Path("/delete/{id}")
	public void deletarProduto( @PathParam("id") int id ) {
		prodDaoImpl.delete(id);
	}
	
	@GET
	@Path("/listar")
	public List<Produto> getListProduto() {
		return prodDaoImpl.getListProdutos();
	}
	
	@GET
	@Path("/recuperaProduto/{id}")
	public Produto getProduto( @PathParam("id") int id) {
		return prodDaoImpl.getProduto(id);
	}
	
	

}