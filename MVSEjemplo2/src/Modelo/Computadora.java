package Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Computadora {
    private String marca;
    private String modelo;
    private double FrecuenciaPorcesador;
    private String urlFoto;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, double frecuenciaPorcesador, String urlFoto) {
        this.marca = marca;
        this.modelo = modelo;
        FrecuenciaPorcesador = frecuenciaPorcesador;
        this.urlFoto = urlFoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuenciaPorcesador() {
        return FrecuenciaPorcesador;
    }

    public void setFrecuenciaPorcesador(double frecuenciaPorcesador) {
        FrecuenciaPorcesador = frecuenciaPorcesador;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", FrecuenciaPorcesador=" + FrecuenciaPorcesador +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

    public ImageIcon createIcon(){
        ImageIcon resultado = null;

        try {
            URL urlImagen = new URL(this.urlFoto);
            resultado = new ImageIcon(urlImagen);

        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
