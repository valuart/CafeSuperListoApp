package com.example.cafesuperlisto.modelo;

import java.io.Serializable;

public class DetallePedido implements Serializable {
    private int id;
    private int idPed;
    private Pedido pedido;
    private double total;
    private boolean estado;

    public DetallePedido() {
    }

    public DetallePedido(int id, int idPed, Pedido pedido, double total, boolean estado) {
        this.id = id;
        this.idPed = idPed;
        this.pedido = pedido;
        this.total = total;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPed() {
        return idPed;
    }

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
