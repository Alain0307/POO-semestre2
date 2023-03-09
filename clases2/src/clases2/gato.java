package clases2;

import java.awt.*;

public class gato {
    private String nombre;
    private Integer edad;
    private String raza;
    private Color colorpelo;

    public gato() {
    }

    public gato(String nombre, Integer edad, String raza, Color colorpelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.colorpelo = colorpelo;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(Color colorpelo) {
        this.colorpelo = colorpelo;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", colorpelo=" + colorpelo +
                '}';
    }

    public void maullar(){
        System.out.println(nombre + " está maullando");
    }

    public void comiendo(){
        System.out.println(nombre + " está comiendo");
    }

    public void dormir(){
        System.out.println(nombre + " está durmiendo");
    }
}
