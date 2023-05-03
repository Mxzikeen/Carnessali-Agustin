package Models;

public class Impresora extends Informaticos implements Descuento{
    private Integer impresPorMin;

    public Integer getImpresPorMin() {
        return impresPorMin;
    }

    public void setImpresPorMin(Integer impresPorMin) {
        this.impresPorMin = impresPorMin;
    }

    public Impresora(Integer stock, String nombre, Double precio, String fabricante, Integer impresPorMin) {
        super(stock, nombre, precio, fabricante);
        this.impresPorMin = impresPorMin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresPorMin=" + impresPorMin +
                "} " + super.toString();
    }

    @Override
    public Double descuentoEspecial(Double porcentaje) {
        Double precio = this.getPrecio() - this.getPrecio()* (porcentaje / 100);
        return precio;
    }
}
