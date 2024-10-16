package br.com.fiap.fiaptechchallengefase4.presenters.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
}
