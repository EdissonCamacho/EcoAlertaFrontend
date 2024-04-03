package com.ecoalerta.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario", schema = "ecoalerta")
public class Usuario {
    @Id
    @Column(name = "Id_usuario", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "usuario", length = 45)
    private String usuario;

    @Size(max = 45)
    @Column(name = "nombre", length = 45)
    private String nombre;

    @Size(max = 45)
    @Column(name = "apellido", length = 45)
    private String apellido;

    @Size(max = 45)
    @Column(name = "telefono", length = 45)
    private String telefono;

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    @Size(max = 45)
    @Column(name = "password", length = 45)
    private String password;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_ciudad_FK", nullable = false)
    private Ciudad idCiudadFk;

    @OneToMany(mappedBy = "idUsuarioFk")
    private Set<ArticuloUsuario> articuloUsuarios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idUsuarioFk")
    private Set<Comentarioarticulo> comentarioarticulos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idUsuarioFk")
    private Set<Like> likes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idUsuarioFk")
    private Set<RolUsuario> rolUsuarios = new LinkedHashSet<>();

}