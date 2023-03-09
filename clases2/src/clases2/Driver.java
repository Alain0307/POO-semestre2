package clases2;


import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        pais p1 = new pais("LA", 1000000, "Elm Street", "Estados Unidos");
        System.out.println(p1);
        p1.importar();
        p1.recesion();

        giroscopio g1 = new giroscopio(30, 13.43, true);
        System.out.println(g1);
        g1.encender();
        g1.medirVelocidad();
        g1.apagar();

        computadora c1 = new computadora("HP", 1000, 16, "AMD");
        System.out.println(c1);
        c1.encender();
        c1.actualizar();
        c1.reiniciar();
        c1.apagar();

        cuboRubik cb1 = new cuboRubik(3,3,6);
        System.out.println(cb1);
        cb1.girarAbajo1();
        cb1.girarDerecha1();

        libro lib1 = new libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Pluton ediciones", "Novela", 1345);
        System.out.println(lib1);
        lib1.abrir();
        lib1.pasarPagina();
        lib1.cerrar();

        balon b1 = new balon("Wilson", "Futbol", Color.BLACK, "Plástico");
        System.out.println(b1);
        b1.patearBalon();
        b1.rebotar();

        lampara lmp1 = new lampara("Lumimexico", "Incandescente", 789, "Lámpara de mesa");
        System.out.println(lmp1);
        lmp1.encender();
        lmp1.apagar();

        gato cat = new gato("German", 18, "Bengalí", Color.DARK_GRAY);
        System.out.println(cat);
        cat.maullar();
        cat.comiendo();
        cat.dormir();

    }
}
