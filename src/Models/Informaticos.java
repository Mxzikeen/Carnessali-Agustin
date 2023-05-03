package Models;

public class Informaticos extends  Productos{
    private String fabricante;

    public Informaticos(Integer stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Informaticos{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
