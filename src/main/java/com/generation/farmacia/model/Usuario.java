package com.generation.farmacia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo name é obrigatorio")
    private String name;

    @Email(message = "O atributo username tem que receber um e-mail válido")
    @NotBlank(message = "O atributo username é obrigatorio")
    private String username;

    @NotBlank(message = "O atributo password é obrigatorio")
    @Size(min = 8, message = "O password tem que ser no mínimo 8 caracteres")
    private Double password;

    @NotNull(message = "O atributo birth não pode ser nulo")
    private Date birth;

    @Size(max = 4000,message = "O link da photo inserida não pode passar dos 4000 caracteres")
    private String photo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getPassword() {
        return password;
    }

    public void setPassword(Double password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
