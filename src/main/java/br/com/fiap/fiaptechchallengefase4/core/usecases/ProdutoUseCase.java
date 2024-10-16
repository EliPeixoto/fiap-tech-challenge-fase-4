package br.com.fiap.fiaptechchallengefase4.core.usecases;

import br.com.fiap.fiaptechchallengefase4.core.domain.Produto;
import br.com.fiap.fiaptechchallengefase4.core.mapper.ProdutoMapper;
import br.com.fiap.fiaptechchallengefase4.infra.repository.ProdutoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoUseCase {

    private final ProdutoRepository produtoRepository;

    public ProdutoUseCase(ProdutoRepository productRepository) {
        this.produtoRepository = productRepository;
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll().stream()
                .map(ProdutoMapper::toDomain)
                .collect(Collectors.toList());
    }

    public Produto getProdutoById(Long id) {
        return ProdutoMapper.toDomain(produtoRepository.findById(id));
    }

    public void saveProduto(Produto product) {
        produtoRepository.save(ProdutoMapper.toEntity(product));
    }

    public void deleteProduto(Long id) {
        produtoRepository.delete(id);
    }


}
