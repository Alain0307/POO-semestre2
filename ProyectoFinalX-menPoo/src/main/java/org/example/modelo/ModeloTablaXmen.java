package org.example.modelo;

import org.example.persistencia.XmenDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaXmen implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Xmen> datos;
    private XmenDAO xdao;

    public ModeloTablaXmen() {
        xdao = new XmenDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaXmen(ArrayList<Xmen> datos) {
        this.datos = datos;
        xdao = new XmenDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Poder";
            case 3:
                return "Equipo";
            case 4:
                return "Moral";
            case 5:
                return "Url";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Xmen tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getPoder();
            case 3:
                return tmp.getEquipo();
            case 4:
                return tmp.getMoral();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setPoder((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setEquipo((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setMoral((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDtos(){

        try {
            ArrayList<Xmen> tirar = xdao.obtenerTodo();
            System.out.println(tirar);
            datos = xdao.obtenerTodo();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarXmen(Xmen xmen){
       boolean resultado = false;
        try {
            if (xdao.insertar(xmen)) {
                datos.add(xmen);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Xmen obtenerXmen(int rowIndex) throws IndexOutOfBoundsException{
        return datos.get(rowIndex);
    }
}
