package org.example.controlador;

import org.example.modelo.ModeloTablaXmen;
import org.example.modelo.Xmen;
import org.example.persistencia.XmenDAO;
import org.example.vista.VentanaXmen;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

public class ControladorXmen extends MouseAdapter {
    private VentanaXmen view;
    private ModeloTablaXmen modelo;

    public ControladorXmen(VentanaXmen view) {
        this.view = view;
        modelo = new ModeloTablaXmen();
        this.view.getTblXmen().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblXmen().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){

            modelo.cargarDtos();
            this.view.getTblXmen().setModel(modelo);
            this.view.getTblXmen().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            Xmen xmen = new Xmen();
            xmen.setId(0);
            xmen.setNombre(this.view.getTxtNombre().getText());
            xmen.setPoder(this.view.getTxtPoder().getText());
            xmen.setEquipo(this.view.getTxtEquipo().getText());
            xmen.setMoral(this.view.getTxtMoral().getText());
            xmen.setUrl(this.view.getTxtUrl().getText());

            if (modelo.agregarXmen(xmen)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblXmen().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su conexión :((",
                        "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();

            }
        if(e.getSource() == view.getTblXmen()){
            System.out.println("Clic sobre la tabla");

            int rowIndex = view.getTblXmen().getSelectedRow();

            Xmen temp = modelo.obtenerXmen(rowIndex);

            view.getLblImagen().setText("");
            view.getLblImagen().setIcon(temp.createIcon());
        }

        if (e.getSource() == view.getBtnEliminar()){
            System.out.println("Clic en eliminar");
            XmenDAO xdao =new XmenDAO();
            try{
                if (xdao.delete(this.view.getTxtElimid().getText())){
                    JOptionPane.showMessageDialog(view,"Se elimino correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblXmen().updateUI();
                }
            }catch(SQLException sqle){
                System.out.println("Error al eliminar");
            }

        }

        if (e.getSource() == view.getBtnActualizar()){
            XmenDAO xdao = new XmenDAO();
            Xmen xmen = new Xmen();
            xmen.setId(Integer.parseInt(this.view.getTxtElimid().getText()));
            xmen.setNombre(this.view.getTxtEditNom().getText());
            xmen.setPoder(this.view.getTxtEditPod().getText());
            xmen.setEquipo(this.view.getTxtEditEquip().getText());
            xmen.setMoral(this.view.getTxtEditMoral().getText());
            xmen.setUrl(this.view.getTxtEditUrl().getText());
            try {
                if (xdao.update(xmen)){
                    JOptionPane.showMessageDialog(view,"Se Edito exitosamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblXmen().updateUI();
                }
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
                JOptionPane.showMessageDialog(view, "Faltan por llenar espacios", "Advertencia",JOptionPane.ERROR_MESSAGE);
            }

            this.view.limpiar2();
        }

    }

}
