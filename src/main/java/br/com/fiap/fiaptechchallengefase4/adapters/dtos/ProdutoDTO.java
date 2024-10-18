package br.com.fiap.fiaptechchallengefase4.adapters.dtos;


import br.com.fiap.fiaptechchallengefase4.core.domain.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;

    public ProdutoDTO (Produto produto){
        this.id=produto.getId();


    }
    public Produto getProdutoDomain(){
        return new Produto(id,nome,preco);
    }
}
