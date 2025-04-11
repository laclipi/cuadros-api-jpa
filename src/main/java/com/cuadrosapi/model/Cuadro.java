package com.cuadrosapi.model;

import jakarta.persistence.*;

/**
 * Entidad JPA que representa un Cuadro en la base de datos.
 */
@Entity
public class Cuadro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String artista;
    private double precio;

    public Cuadro() {}

    public Cuadro(String titulo, String artista, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
