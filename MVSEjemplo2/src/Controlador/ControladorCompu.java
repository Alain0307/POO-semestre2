package Controlador;

import Modelo.Computadora;
import Modelo.ModeloTablaCompu;
import Vista.VentanaComputadora;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorCompu extends MouseAdapter {
    private VentanaComputadora view;
    private ModeloTablaCompu modelo;

    public ControladorCompu(VentanaComputadora view) {
        this.view = view;

        view.getBtnAgregar().addMouseListener(this);
        view.getTblComputadora().addMouseListener(this);

        modelo = new ModeloTablaCompu();
        view.getTblComputadora().setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == view.getBtnAgregar()) {

            System.out.println("Se dio click en el botón");

            Computadora temp = new Computadora();

            temp.setMarca(view.getTxtMarca().getText());
            temp.setModelo(view.getTxtModelo().getText());
            temp.setFrecuenciaPorcesador(Double.parseDouble(view.getTxtFrecuencia().getText()));
            temp.setUrlFoto(view.getTxtUrlFoto().getText());

            modelo.agregarComputadora(temp);

            //Actualiza la vista
            view.getTblComputadora().updateUI();


        }

        if(e.getSource() == view.getTblComputadora()){
            System.out.println("Clic sobre la tabla");

            int rowIndex = view.getTblComputadora().getSelectedRow();

            Computadora temp = modelo.obtenerComputadora(rowIndex);

            view.getLblImagen().setText("");
            view.getLblImagen().setIcon(temp.createIcon());
        }

    }
}
