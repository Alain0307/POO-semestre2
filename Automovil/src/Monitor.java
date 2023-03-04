public class Monitor {
    private double pulgada;
    private String marca;
    private String modelo;
    private String tipo;

    public Monitor() {
    }

    public Monitor(double pulgada, String marca, String modelo, String tipo) {
        this.pulgada = pulgada;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public double getPulgada() {
        return pulgada;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgada=" + pulgada +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Monitor " + marca + " está encendiendo...");
    }

    public void apagar(){
        System.out.println("Monitor " + marca + " está apagandose...");
    }

    public void proyectar(){
        System.out.println("Monitor " + marca + " está proyectando");
    }
}
