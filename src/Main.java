import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Escritorio escritorio = new Escritorio(5, "Escritorio Gamer", 35000.0, 150.0, 80.0);
        Impresora impresora = new Impresora(25, "Stylus 220", 50000.0, "Epson", 30);
        Notebook notebook = new Notebook(10, "I-mac", 700000.0, "Apple", 1024);
        Silla silla = new Silla(40, "Silla Gamer", 63000.0, true);

        // aca pruebo la funcion de la interfaz
        System.out.println("Aplicando descuento de 25% a cliente por la compra de una silla. Debera pagar: " + silla.descuentoEspecial(25.0)+ " en vez de: "+ silla.getPrecio());
        System.out.println("Aplicando descuento de 50% a cliente por la compra de una impresora. Debera pagar: " + impresora.descuentoEspecial(50.0)+ " en vez de: " + impresora.getPrecio());

        //aca me fijo q no me cambio los precios de la instancia
        System.out.println(silla.getPrecio());
        System.out.println(impresora.getPrecio());

        // cree una clase contenedora que tiene una lista de productos y metodos.
        Tienda tienda = new Tienda();

        // agrego los productos a la lista de la tienda utilizando el metodo de clase
        tienda.agregar(escritorio);
        tienda.agregar(notebook);
        tienda.agregar(silla);
        tienda.agregar(impresora);

        // muestro los productos de la tienda usando el metodo de clase
        tienda.listar();
        // actualizo todos los precios y muestro los precios antes y luego de la modificacion.
        tienda.actualizarPrecios();

    }
}