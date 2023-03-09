package clases2;

public class libro {
    private String nombre;
    private String autor;
    private String editorial;
    private String genero;
    private Integer numPaginas;

    public libro() {
    }

    public libro(String nombre, String autor, String editorial, String genero, Integer numPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", genero='" + genero + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public void abrir(){
        System.out.println("Abriendo libro " + nombre);
    }

    public void pasarPagina(){
        System.out.println("Pasando página...");
    }

    public void cerrar(){
        System.out.println("Cerrando libro " + nombre);
    }
}
