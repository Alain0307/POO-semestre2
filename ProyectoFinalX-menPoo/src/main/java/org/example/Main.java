package org.example;

import org.example.controlador.ControladorXmen;
import org.example.modelo.Xmen;
import org.example.persistencia.XmenDAO;
import org.example.vista.VentanaXmen;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaXmen view = new VentanaXmen("X-Men");
        ControladorXmen controller = new ControladorXmen(view);
    }
}