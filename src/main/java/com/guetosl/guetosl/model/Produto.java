package com.guetosl.guetosl.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "Produto")
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque;
    private String categoria;
    private String imagem;
    private LocalDateTime data_Cadastro;

    // getters e setters

    public int getIdProduto() {return idProduto; }
    public void setIdProduto(int idProduto) {this.idProduto = idProduto; }

    public String getNome() {return nome; }
    public void setNome(String nome) {this.nome = nome; }

    public String getDescricao() {return descricao; }
    public void setDescricao(String descricao) {this.descricao = descricao; }

    public BigDecimal getPreco() {return preco;}
    public void setPreco(BigDecimal preco) {this.preco = preco; }

    public int getEstoque() {return estoque;}
    public void setEstoque(int estoque) {this.estoque = estoque; }
    
    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getimagem() {return imagem;}
    public void setImagem(String imagem) {this.imagem = imagem; }

    public LocalDateTime getDataCadastro() {return data_Cadastro; }
    public void setDataCadastro(LocalDateTime data_Cadastro) {this.data_Cadastro = data_Cadastro; }
}

