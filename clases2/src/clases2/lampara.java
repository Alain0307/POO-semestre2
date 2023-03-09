package clases2;

public class lampara {
    private String marca;
    private String tipoIluminacion;
    private Integer precio;
    private String tipo;

    public lampara() {
    }

    public lampara(String marca, String tipoIluminacion, Integer precio, String tipo) {
        this.marca = marca;
        this.tipoIluminacion = tipoIluminacion;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoIluminacion() {
        return tipoIluminacion;
    }

    public void setTipoIluminacion(String tipoIluminacion) {
        this.tipoIluminacion = tipoIluminacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "lampara{" +
                "marca='" + marca + '\'' +
                ", tipoIluminacion='" + tipoIluminacion + '\'' +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo lámpara...");
    }

    public void apagar(){
        System.out.println("Apagando lámpara...");
    }
}
