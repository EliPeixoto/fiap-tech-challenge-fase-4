package br.com.fiap.fiaptechchallengefase4.infra.repository;

import br.com.fiap.fiaptechchallengefase4.core.domain.Produto;
import br.com.fiap.fiaptechchallengefase4.infra.persistence.ProdutoEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {
    private final List<ProdutoEntity> products = new ArrayList<>();

    @Override
    public List<ProdutoEntity> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public ProdutoEntity findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(ProdutoEntity produto) {
        products.add(produto);
    }

    @Override
    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}

