package ejemplo2;

public class Camion implements Vehiculo{
    private String combustible;
    private double peso;

    public Camion() {
    }

    public Camion(String combustible, double peso) {
        this.combustible = combustible;
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustible='" + combustible + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void transportar(){
        System.out.println("Transportando algo...");
    }


    @Override
    public boolean encender() {
        System.out.println("Encendiendo camion de combustible " + this.combustible);
        return Math.random() >= 0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando camion de combustible " + this.combustible);
        return Math.random() >= 0.5;
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");

    }

    @Override
    public void avanzar() {
        System.out.println("El camion está avanzando...");

    }
}
