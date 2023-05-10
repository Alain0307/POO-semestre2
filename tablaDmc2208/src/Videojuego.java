public class Videojuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoenGb;
    private String platafroma;
    private String desarrollador;

    public Videojuego() {
    }

    public Videojuego(int id, String nombre, String genero, double pesoenGb, String platafroma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoenGb = pesoenGb;
        this.platafroma = platafroma;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPesoenGb() {
        return pesoenGb;
    }

    public void setPesoenGb(double pesoenGb) {
        this.pesoenGb = pesoenGb;
    }

    public String getPlatafroma() {
        return platafroma;
    }

    public void setPlatafroma(String platafroma) {
        this.platafroma = platafroma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pesoenGb=" + pesoenGb +
                ", platafroma='" + platafroma + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
