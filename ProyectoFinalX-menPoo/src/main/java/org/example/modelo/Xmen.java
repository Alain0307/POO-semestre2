package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Xmen {
    private int id;
    private String nombre;
    private String poder;
    private String equipo;
    private String moral;
    private String url;

    public Xmen() {
    }

    public Xmen(int id, String nombre, String poder, String equipo, String moral, String url) {
        this.id = id;
        this.nombre = nombre;
        this.poder = poder;
        this.equipo = equipo;
        this.moral = moral;
        this.url = url;
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

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Xmen{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", poder='" + poder + '\'' +
                ", equipo='" + equipo + '\'' +
                ", moral='" + moral + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public ImageIcon createIcon(){
        ImageIcon resultado = null;

        try{
            URL urlImagen = new URL(this.url);
            resultado = new ImageIcon(urlImagen);
        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
