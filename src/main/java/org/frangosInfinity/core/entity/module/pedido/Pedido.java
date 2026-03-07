package org.frangosInfinity.core.entity.module.pedido;
import org.frangosInfinity.core.entity.module.mesa.Mesa;
import org.frangosInfinity.core.entity.module.usuario.Atendente;
import org.frangosInfinity.core.enums.StatusPedido;

import java.time.LocalDateTime;

public class Pedido {

    // Atributos

    private Long id;
    private String numeroPedido;
    private LocalDateTime dataHora;
    private StatusPedido status;
    private Mesa mesa;
    private Atendente atendente;
    private String tipo;

    // Construtores

    public Pedido(){}

    public Pedido(String numeroPedido, LocalDateTime dataHora, StatusPedido status, Mesa mesa, Atendente atendente, String tipo) {
        this.numeroPedido = numeroPedido;
        this.dataHora = dataHora;
        this.status = status;
        this.mesa = mesa;
        this.atendente = atendente;
        this.tipo = tipo;
    }

    // Getters & Setters

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
