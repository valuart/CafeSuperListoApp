package com.example.cafesuperlisto.modelo;

import java.io.Serializable;

public class Producto implements Serializable {
    private int id;
    private String tipoProducto;
    private double precio;
    private String imagen;

    public Producto() {
    }

    public Producto(int id, String tipoProducto, double precio, String imagen) {
        this.id = id;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
