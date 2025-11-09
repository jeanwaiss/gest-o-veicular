package com.concessionaria.model;

import jakarta.persistence.*;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    private Double preco;
    private Double quilometragem;
    private String status; // "DISPONIVEL", "VENDIDO"

    // Construtor vazio (OBRIGATÓRIO para JPA)
    public Veiculo() {}

    // Construtor com parâmetros
    public Veiculo(String modelo, String marca, Integer ano, String cor, Double preco, Double quilometragem, String status) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.status = status;
    }

    // GETTERS E SETTERS (use Alt+Insert para gerar automaticamente)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Double getQuilometragem() { return quilometragem; }
    public void setQuilometragem(Double quilometragem) { this.quilometragem = quilometragem; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}