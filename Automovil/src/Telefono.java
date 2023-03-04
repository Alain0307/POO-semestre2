public class Telefono {
    private String marca;
    private String subMarca;
    private double pulgada;
    private Integer memoria;
    private byte ram;

    public Telefono() {
    }

    public Telefono(String marca, String subMarca, double pulgada, Integer memoria, byte ram) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.pulgada = pulgada;
        this.memoria = memoria;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public double getPulgada() {
        return pulgada;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public byte getRam() {
        return ram;
    }

    public void setRam(byte ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", pulgada=" + pulgada +
                ", memoria=" + memoria +
                ", ram=" + ram +
                '}';
    }

    public void apagado(){
        System.out.println("El teléfono " + subMarca + " está apagándose...");
    }

    public void reinicio(){
        System.out.println("El teléfono " + subMarca + " está reiniciandose...");
    }

    public void carga(){
        System.out.println("El teléfono " + subMarca + " está cargando");
    }
}
