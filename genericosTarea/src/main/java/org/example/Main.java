package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0,"hola");
        miCaja.add(1,"adios");
        miCaja.add(2,"hi");
        System.out.println(miCaja);

        System.out.println("------------");

        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"Hola");
        cajaSin.add(1,"adios");
        cajaSin.add(2,"Hiii");
        System.out.println(cajaSin);

        System.out.println("-------------");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("yogurt", true));
        System.out.println(cajaComida.get(0));

        System.out.println("-------------");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yogurt", false));
        comidas2.add(new Comida("Danonino", false));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bistec", false));
        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));

        for (Comida comida : comidas2){
            System.out.println(comida);
        }




    }
}