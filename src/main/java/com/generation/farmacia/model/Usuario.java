package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.sql.Date;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo name é obrigatorio")
    private String nome;

    @Schema(example = "email@email.com.br")
    @Email(message = "O atributo username tem que receber um e-mail válido")
    @NotBlank(message = "O atributo username é obrigatorio")
    private String usuario;

    @NotBlank(message = "O atributo password é obrigatorio")
    @Size(min = 8, message = "O password tem que ser no mínimo 8 caracteres")
    private String senha;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @NotNull(message = "Insira sua data de nascimento")
    private Date nascimento;

    @Size(max = 4000,message = "O link da photo inserida não pode passar dos 4000 caracteres")
    private String foto;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
