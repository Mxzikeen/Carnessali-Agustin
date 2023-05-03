package Models;

public class Notebook extends Informaticos  {
    private Integer memoria;

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Notebook(Integer stock, String nombre, Double precio, String fabricante, Integer memoria) {
        super(stock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }

}
