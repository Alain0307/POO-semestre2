package clases2;

import java.awt.*;

public class balon {
    private String marca;
    private String deporte;
    private Color colorb;
    private String material;

    public balon() {
    }

    public balon(String marca, String deporte, Color colorb, String material) {
        this.marca = marca;
        this.deporte = deporte;
        this.colorb = colorb;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Color getColorb() {
        return colorb;
    }

    public void setColorb(Color colorb) {
        this.colorb = colorb;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "balon{" +
                "marca='" + marca + '\'' +
                ", deporte='" + deporte + '\'' +
                ", colorb=" + colorb +
                ", material='" + material + '\'' +
                '}';
    }

    public void lanzarBalon(){
        System.out.println("Lanzando balon...");
    }

    public void patearBalon(){
        System.out.println("Pateando balon...");
    }

    public void rebotar(){
        System.out.println("Balon rebotando");
    }
}
