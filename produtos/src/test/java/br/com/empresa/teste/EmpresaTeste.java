package br.com.empresa.teste;

import java.util.HashSet;
import java.util.Set;

import br.com.empresa.DaoImpl.CategoriaDaoImpl;
import br.com.empresa.Model.Categoria;
import br.com.empresa.Model.Produto;

public class EmpresaTeste {
	
	
	public static void main(String[] args) {
		
		Categoria categoria = new Categoria();
		categoria.setDescricao("Informática");
		
		Produto prod1 = new Produto();
		prod1.setCodigoBarra("1234567890");
		prod1.setNome("Computador Celeron AX5");
		prod1.setDescricao("computador razoável");
		prod1.setQuantidade(12);
		prod1.setCategoria(categoria);
		
		Produto prod2 = new Produto();
		prod2.setCodigoBarra("00998877665544");
		prod2.setNome("Computador Intel VX5");
		prod2.setDescricao("computador bom");
		prod2.setQuantidade(34);
		prod2.setCategoria(categoria);
		
		Produto prod3 = new Produto();
		prod3.setCodigoBarra("677890154322");
		prod3.setNome("Computador Dell ZX5");
		prod3.setDescricao("computador excelente");
		prod3.setQuantidade(10);
		prod3.setCategoria(categoria);
		
		
		Set<Produto> produtos = new HashSet<Produto>();
		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		
		categoria.setProdutos(produtos);
		
		new CategoriaDaoImpl().salvarCategoria(categoria);
		
		
		
		
		
	}
	
	
}
