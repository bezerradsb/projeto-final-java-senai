package br.com.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.models.Produto;

public interface ProdutoRepository  extends CrudRepository <Produto, String>{

}
