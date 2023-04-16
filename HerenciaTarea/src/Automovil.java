public class Automovil extends Vehiculo {
    protected String combustible;
    protected Integer anio;
    protected String subMarca;

    public Automovil() {
    }

    public Automovil(String marca, Integer capPasajeros, String tipo, String combustible, Integer anio, String subMarca) {
        super(marca, capPasajeros, tipo);
        this.combustible = combustible;
        this.anio = anio;
        this.subMarca = subMarca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "combustible='" + combustible + '\'' +
                ", anio=" + anio +
                ", subMarca='" + subMarca + '\'' +
                ", marca='" + marca + '\'' +
                ", capPasajeros=" + capPasajeros +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void abrirVentana(){
        System.out.println("Abriendo ventana...");
    }

    public void cerrarVentana(){
        System.out.println("Cerrando ventana...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo vehículo " + subMarca + " ...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando vehículo " + subMarca + " ...");
    }
}
