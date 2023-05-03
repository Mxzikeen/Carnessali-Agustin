package Models;

public class Silla extends Productos implements Descuento {
    private Boolean ruedas;

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    public Silla(Integer stock, String nombre, Double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }

    @Override
    public Double descuentoEspecial(Double porcentaje) {
        Double precio = this.getPrecio() - this.getPrecio()* (porcentaje / 100);
        return precio;
    }
}
