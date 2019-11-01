package br.edu.ifsp.lp2a2.comparex.comum.model.entidades;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRespository extends CrudRepository<Produto, Long> {
}
