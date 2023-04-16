public class Vehiculo {
    protected String marca;
    protected Integer capPasajeros;
    protected String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, Integer capPasajeros, String tipo) {
        this.marca = marca;
        this.capPasajeros = capPasajeros;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(Integer capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", capPasajeros=" + capPasajeros +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("El vehículo está encendido...");
    }
    public void apagar(){
        System.out.println("El vehículo está apagado...");
    }
}
