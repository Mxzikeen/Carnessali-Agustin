package Models;

import java.util.List;

public class Productos {
    private Integer stock;
    private String nombre;
    private Double precio;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Productos(Integer stock, String nombre, Double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
