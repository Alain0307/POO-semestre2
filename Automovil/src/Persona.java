public class Persona {
    private String nombre;
    private Integer edad;
    private double estatura;
    private String genero;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, double estatura, String genero, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.genero = genero;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void dormir(){
        System.out.println("" + nombre + " está durmiendo");
    }

    public void comer(){
        System.out.println("" + nombre + " está comiendo");
    }

    public void baniar(){
        System.out.println("" + nombre + " está bañandose");
    }
}
