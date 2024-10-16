package br.com.fiap.fiaptechchallengefase4.core.mapper;

import br.com.fiap.fiaptechchallengefase4.core.domain.Produto;
import br.com.fiap.fiaptechchallengefase4.infra.persistence.ProdutoEntity;
import br.com.fiap.fiaptechchallengefase4.presenters.dtos.ProdutoDTO;

public class ProdutoMapper {
    public static Produto toDomain(ProdutoEntity entity) {
        Produto produto = new Produto();
        produto.setId(entity.getId());
        produto.setNome(entity.getNome());
        produto.setPreco(entity.getPreco());
        return produto;
    }

    public static ProdutoEntity toEntity(Produto domain) {
        ProdutoEntity entity = new ProdutoEntity();
        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setPreco(domain.getPreco());
        return entity;
    }
}
