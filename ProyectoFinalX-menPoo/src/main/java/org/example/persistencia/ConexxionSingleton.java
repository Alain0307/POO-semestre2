package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexxionSingleton {
    private String baseDatos;
    public static ConexxionSingleton _instance;
    private Connection conexion;

    private ConexxionSingleton(String database){
        this.baseDatos = database;
        try{
           Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        }catch (SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ConexxionSingleton getInstance(String baseDatos){
        if (_instance == null){
            _instance = new ConexxionSingleton(baseDatos);
        }else {
            System.out.println("Ya fue creado");
        }
        return _instance;
    }

    public Connection getConexion(){
        return conexion;
    }
}
