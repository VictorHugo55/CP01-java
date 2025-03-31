package br.com.fiap.catalogo_carro_api.domainModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "Carros")
public class Carros {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;
    private @Getter @Setter String modelo;
    private @Getter @Setter String marca;
    private @Getter @Setter int ano;
    private @Getter @Setter int potencia;
    private @Getter @Setter int economia;
    private @Getter @Setter String tipo;
    private @Getter @Setter double preco;

    public Carros(){

    }

    public Carros(String modelo, String marca, int ano, int potencia, int economia, String tipo, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.economia = economia;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Carros(Long id, String modelo, String marca, int ano, int potencia, int economia, String tipo, double preco) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.economia = economia;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;

        }
        Carros carros = (Carros) o;
        return Objects.equals(id, carros.id);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", economia=" + economia +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEconomia() {
        return economia;
    }

    public void setEconomia(int economia) {
        this.economia = economia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
