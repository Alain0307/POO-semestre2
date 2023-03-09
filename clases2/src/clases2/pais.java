package clases2;

public class pais {
    private String estados;
    private Integer habitantes;
    private String calles;
    private String nombre;

    public pais() {
    }

    public pais(String estados, Integer habitantes, String calles, String nombre) {
        this.estados = estados;
        this.habitantes = habitantes;
        this.calles = calles;
        this.nombre = nombre;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "pais{" +
                "estados='" + estados + '\'' +
                ", habitantes=" + habitantes +
                ", calles='" + calles + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void recesion(){
        System.out.println(nombre + " ha entrado en recesión");
    }

    public void importar(){
        System.out.println("Importando productos...");
    }
}
