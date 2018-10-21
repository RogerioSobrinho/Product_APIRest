package br.com.rogerio.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rogerio.produtos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
