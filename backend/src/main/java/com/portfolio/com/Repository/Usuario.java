/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.com.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.contraints.NotNull;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;
    @MotNull
    @Column(unique = ture);
    private String nombre;
    @MotNull
    private String nombreUsuario;
    @MotNull
    private String email;
    @MotNull
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", JoinCOlumns = @JoinColumn(name = "rol_id"));
    private Set<Rol> roles = new HashSet<>
}
