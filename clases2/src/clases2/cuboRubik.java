package clases2;

public class cuboRubik {
    private Integer renglon;
    private Integer columnas;
    private Integer caras;

    public cuboRubik() {
    }

    public cuboRubik(Integer renglon, Integer columnas, Integer caras) {
        this.renglon = renglon;
        this.columnas = columnas;
        this.caras = caras;
    }

    public Integer getRenglon() {
        return renglon;
    }

    public void setRenglon(Integer renglon) {
        this.renglon = renglon;
    }

    public Integer getColumnas() {
        return columnas;
    }

    public void setColumnas(Integer columnas) {
        this.columnas = columnas;
    }

    public Integer getCaras() {
        return caras;
    }

    public void setCaras(Integer caras) {
        this.caras = caras;
    }

    @Override
    public String toString() {
        return "cuboRubik{" +
                "renglon=" + renglon +
                ", columnas=" + columnas +
                ", caras=" + caras +
                '}';
    }

    public void girarDerecha1(){
        System.out.println("Girando a la derecha renglon 1");
    }

    public void girarAbajo1(){
        System.out.println("Girando hacia abajo columna 1");
    }

    public void girarIzquierda(){
        System.out.println("Girando a la izquierda renglon 1");
    }

    public void girarArriba(){
        System.out.println("Girando hacia arriba columna 1");
    }
}
