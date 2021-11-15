package com.example.cafesuperlisto.modelo;

import java.io.Serializable;

public class Pedido implements Serializable {
   private int id;
   private int idProd;
   private Producto producto;
   private int idCliente;
   private Cliente cliente;
   private String fechaHoraPedido;
   private double total;

    public Pedido() {
    }

    public Pedido(int id, int idProd, Producto producto, int idCliente, Cliente cliente, String fechaHoraPedido, double total) {
        this.id = id;
        this.idProd = idProd;
        this.producto = producto;
        this.idCliente = idCliente;
        this.cliente = cliente;
        this.fechaHoraPedido = fechaHoraPedido;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(String fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
