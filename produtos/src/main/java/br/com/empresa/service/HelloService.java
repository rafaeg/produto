package br.com.empresa.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMensagem( @QueryParam("usuario") String usuario) {
		return "Bem vindo "+ usuario;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/usuario/{id}")
	public String getUsuario(@PathParam("id") long id) {
		return "recupenado usu�rio com ID " + id;
	}
	
}
