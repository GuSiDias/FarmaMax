package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @NotBlank(message = "O atributo nome é obrigatorio")
    private String nome;

     @NotBlank(message = "O atributo descrição é obrigatorio")
    @Size(max = 150, message = "O atributo descrição pode ter no maximo 150 caracteres")
    private String descricao;

     @NotNull(message = "O atributo preço não pode ser nulo")
    private double preco;

    @NotNull(message = "O atributo estoque não pode ser nulo")
    private int estoque;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
