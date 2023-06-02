package org.example.persistencia;

import org.example.modelo.Xmen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class XmenDAO implements IntefazDAO{

    public XmenDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO xmen(nombre,poder,equipo,moral,url) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexxionSingleton.getInstance("xmen.db").getConexion().prepareStatement(sqlInsert);
        pstm.setString(1,((Xmen)obj).getNombre());
        pstm.setString(2,((Xmen)obj).getPoder());
        pstm.setString(3,((Xmen)obj).getEquipo());
        pstm.setString(4,((Xmen)obj).getMoral());
        pstm.setString(5,((Xmen)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE xmen SET nombre = ?, poder = ?, equipo = ?, moral = ?, Url = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexxionSingleton.getInstance("xmen.db").getConexion().prepareStatement(sqlUpdate);
        pstm.setString(1,((Xmen)obj).getNombre());
        pstm.setString(2,((Xmen)obj).getPoder());
        pstm.setString(3,((Xmen)obj).getEquipo());
        pstm.setString(4,((Xmen)obj).getMoral());
        pstm.setString(5,((Xmen)obj).getUrl());
        pstm.setInt(6, ((Xmen)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM xmen WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexxionSingleton.getInstance("xmen.db").getConexion().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM xmen";
        ArrayList<Xmen> resultado = new ArrayList<>();

            Statement stm = ConexxionSingleton.getInstance("xmen.db").getConexion().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Xmen(rst.getInt(1),rst.getString(2),rst.getString(3), rst.getString(4),rst.getString(5),rst.getString(6)));

            }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM xmen WHERE id = ?;";
        Xmen xmen = null;

            PreparedStatement pstm = ConexxionSingleton.getInstance("xmen.db").getConexion().prepareStatement(sql);
            pstm.setInt(1, Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                xmen = new Xmen(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
                return xmen;
            }


        return null;
    }
}
