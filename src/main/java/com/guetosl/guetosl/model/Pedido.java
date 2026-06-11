package com.guetosl.guetosl.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "Pedido")
public class Pedido{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private LocalDateTime data_Compra;
    private LocalDateTime data_Envio;
    private String status;
    private BigDecimal total;
    private String endereco_Entrega;

    //getters e setters

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) {this.idPedido = idPedido;}

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public LocalDateTime getData_Compra() {return data_Compra; }
    public void setData_Compra(LocalDateTime data_Compra) {this.data_Compra = data_Compra; }

    public LocalDateTime getData_Envio() {return data_Envio; }
    public void setData_Envio(LocalDateTime data_Envio) {this.data_Envio = data_Envio; }

    public String getStatus() {return status; }
    public void setStatus(String status) {this.status = status; }

    public BigDecimal getTotal() {return total; }
    public void setTotal(BigDecimal total) {this.total = total; }


    public String  getEndereco_Entrega() {return endereco_Entrega; }
    public void setEndereco_Entrega(String endereco_Entrega) {this.endereco_Entrega = endereco_Entrega;  }
    
}