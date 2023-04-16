public class Taxi extends Automovil {
    private String marcaTaxi;
    private boolean disponible;
    private String color;

    public Taxi() {
    }

    public Taxi(String marca, Integer capPasajeros, String tipo, String combustible, Integer anio, String subMarca, String marcaTaxi, boolean disponible, String color) {
        super(marca, capPasajeros, tipo, combustible, anio, subMarca);
        this.marcaTaxi = marcaTaxi;
        this.disponible = disponible;
        this.color = color;
    }

    public String getMarcaTaxi() {
        return marcaTaxi;
    }

    public void setMarcaTaxi(String marcaTaxi) {
        this.marcaTaxi = marcaTaxi;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "marcaTaxi='" + marcaTaxi + '\'' +
                ", disponible=" + disponible +
                ", color='" + color + '\'' +
                ", combustible='" + combustible + '\'' +
                ", anio=" + anio +
                ", subMarca='" + subMarca + '\'' +
                ", marca='" + marca + '\'' +
                ", capPasajeros=" + capPasajeros +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void iniTaxi(){
        System.out.println("Iniciando taxímetro...");
    }

    public void cobrar(){
        System.out.println("Cobrando al pasajero...");
    }

}
