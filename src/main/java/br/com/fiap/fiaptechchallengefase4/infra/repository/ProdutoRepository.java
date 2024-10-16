package br.com.fiap.fiaptechchallengefase4.infra.repository;

import br.com.fiap.fiaptechchallengefase4.core.domain.Produto;
import br.com.fiap.fiaptechchallengefase4.infra.persistence.ProdutoEntity;

import java.util.List;

public interface ProdutoRepository {
    List<ProdutoEntity> findAll();
    ProdutoEntity findById(Long id);
    void save(ProdutoEntity product);
    void delete(Long id);
}
