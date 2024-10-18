package br.com.fiap.fiaptechchallengefase4.presenters.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double preco;
}
