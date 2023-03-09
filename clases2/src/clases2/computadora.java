package clases2;

public class computadora {
    private String marca;
    private Integer rom;
    private Integer ram;
    private String procesador;

    public computadora() {
    }

    public computadora(String marca, Integer rom, Integer ram, String procesador) {
        this.marca = marca;
        this.rom = rom;
        this.ram = ram;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "computadora{" +
                "marca='" + marca + '\'' +
                ", rom=" + rom +
                ", ram=" + ram +
                ", procesador='" + procesador + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo computadora " + marca);
    }

    public void reiniciar(){
        System.out.println("Reiniciando computadora: " + marca);
    }

    public void apagar(){
        System.out.println("Apagando computadora " + marca);
    }

    public void actualizar(){
        System.out.println("Actualizando computadora " + marca);
    }
}
