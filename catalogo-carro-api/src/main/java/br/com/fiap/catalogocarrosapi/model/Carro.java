package br.com.fiap.catalogocarrosapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARROS")
public class Carro {

    public Carro(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;

    private @Getter @Setter String marca;
    private @Getter @Setter String modelo;
    private @Getter @Setter int ano;
    private @Getter @Setter int potencia;
    private @Getter @Setter double economia;

    @Enumerated(EnumType.STRING)
    private @Getter @Setter TipoVeiculo tipo;

    private @Getter @Setter double preco;
}
