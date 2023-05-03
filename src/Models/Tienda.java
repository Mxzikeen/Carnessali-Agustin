package Models;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Productos> lista;

    public List<Productos> getLista() {
        return lista;
    }

    public void setLista(List<Productos> lista) {
        this.lista = lista;
    }

    public Tienda() {
        lista = new ArrayList<>();
    }
    public void agregar(Productos productos){
        lista.add(productos);
    }
    public void listar(){
        for(Productos p : lista){
            System.out.println(p.toString());
        }
    }
    @Override
    public String toString() {
        return "Tienda{" +
                "lista=" + lista +
                '}';
    }

    public void actualizarPrecios() {
        for (Productos productos : lista) {
            if (productos instanceof Silla) {
                System.out.println("Precio anterior: " + productos.getPrecio());
                productos.setPrecio(productos.getPrecio() + productos.getPrecio() * 0.05);
                System.out.println("Precio posterior: " + productos.getPrecio());
            } else if (productos instanceof Escritorio) {
                System.out.println("Precio anterior: " + productos.getPrecio());
                productos.setPrecio(productos.getPrecio() + productos.getPrecio() * 0.1);
                System.out.println("Precio posterior: " + productos.getPrecio());
            } else if (productos instanceof Notebook) {
                System.out.println("Precio anterior: " + productos.getPrecio());
                productos.setPrecio(productos.getPrecio() + productos.getPrecio() * 0.15);
                System.out.println("Precio posterior: " + productos.getPrecio());
            } else if (productos instanceof Impresora) {
                System.out.println("Precio anterior: " + productos.getPrecio());
                productos.setPrecio(productos.getPrecio() + productos.getPrecio() * 0.2);
                System.out.println("Precio posterior: " + productos.getPrecio());
            }
        }
    }
}
