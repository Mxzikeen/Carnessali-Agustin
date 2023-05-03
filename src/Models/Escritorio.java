package Models;

public class Escritorio extends Productos {
        private Double ancho;
        private Double alto;

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Escritorio(Integer stock, String nombre, Double precio, Double ancho, Double alto) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }
}
