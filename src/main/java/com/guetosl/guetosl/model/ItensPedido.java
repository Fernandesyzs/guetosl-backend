package com.guetosl.guetosl.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedidos")
public class ItensPedido{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItem;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name =  "id_produto")
    private Produto produto;

    private int quantidade;
    private String tamanho;
    private BigDecimal preco_Unitario;


    //getters e setters

    public int getIdItem() {return idItem;}
    public void setIdItem(int idItem) {this.idItem = idItem; }

    public Pedido getPedido() {return pedido; }
    public void setPedido(Pedido pedido) {this.pedido = pedido; }

    public Produto getProduto() {return produto; }
    public void setProduto(Produto produto) {this.produto = produto; }

    public int getQuantidade() {return quantidade; }
    public void setQuantidade(int quantidade) {this.quantidade = quantidade; }

    public String getTamanho() {return tamanho; }
    public void setTamanho(String tamanho) {this.tamanho = tamanho; }

    public BigDecimal getPreco_Unitario() {return preco_Unitario; }
    public void setPreco_Unitario(BigDecimal preco_Unitario) {this.preco_Unitario = preco_Unitario; }


}