package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaXmen extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblPoder;
    private JLabel lblEquipo;
    private JLabel lblMoral;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtPoder;
    private JTextField txtEquipo;
    private JTextField txtMoral;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JTable tblXmen;
    private JScrollPane scrollpane;
    private GridLayout layout;
    private JButton btnCargar;
    private JLabel lblImagen;
    private JLabel lblEliminar;
    private JTextField txtElimid;
    private JLabel lblEditarNom;
    private JLabel lblEditarPod;
    private JLabel lblEditarEqui;
    private JLabel lblEditarMor;
    private JLabel lblEditarUrl;
    private JTextField txtEditNom;
    private JTextField txtEditPod;
    private JTextField txtEditEquip;
    private JTextField txtEditMoral;
    private JTextField txtEditUrl;
    private JButton btnEliminar;
    private JButton btnActualizar;

    private JPanel panel1; //FORMULARIO PARA CAPTURAR
    private JPanel panel2; //TABLA PARA MOSTRAR BASE DE DATOS
    private JPanel panel3; //MOSTRAR IMAGEN URL DE LA TABLA
    private JPanel panel4; //EDITAR Y ELIMINAR ELEMENTOS DE LA TABLA


    public VentanaXmen(String title) throws HeadlessException {
        super(title);
        this.setSize(930,800);

        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(250, 209, 19));

        lblId = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblPoder = new JLabel("Poder:");
        lblEquipo = new JLabel("Equipo:");
        lblMoral = new JLabel("Moral:");
        lblUrl = new JLabel("Url:");

        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(40);
        txtPoder = new JTextField(40);
        txtEquipo = new JTextField(40);
        txtMoral = new JTextField(40);
        txtUrl = new JTextField(40);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblPoder);
        panel1.add(txtPoder);
        panel1.add(lblEquipo);
        panel1.add(txtEquipo);
        panel1.add(lblMoral);
        panel1.add(txtMoral);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(19, 127, 238));

        btnCargar = new JButton("Cargar");

        tblXmen = new JTable();
        scrollpane = new JScrollPane(tblXmen);

        panel2.add(btnCargar);
        panel2.add(scrollpane);

        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(19, 127, 238));

        lblImagen = new JLabel("-----");
        this.panel3.add(lblImagen);

        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(250, 209, 19));

        lblEliminar = new JLabel("Casilla: ");
        txtElimid = new JTextField(3);
        btnEliminar = new JButton("Eliminar");
        this.panel4.add(lblEliminar);
        this.panel4.add(txtElimid);
        this.panel4.add(btnEliminar);

        lblEditarNom = new JLabel("Editar Nombre: ");
        lblEditarPod = new JLabel("Editar Poder: ");
        lblEditarEqui = new JLabel("Editar Equipo: ");
        lblEditarMor = new JLabel("Editar Moral: ");
        lblEditarUrl = new JLabel("Editar Url: ");
        txtEditNom= new JTextField(40);
        txtEditPod= new JTextField(40);
        txtEditEquip= new JTextField(40);
        txtEditMoral= new JTextField(40);
        txtEditUrl= new JTextField(40);

        this.panel4.add(lblEditarNom);
        this.panel4.add(txtEditNom);
        this.panel4.add(lblEditarPod);
        this.panel4.add(txtEditPod);
        this.panel4.add(lblEditarEqui);
        this.panel4.add(txtEditEquip);
        this.panel4.add(lblEditarMor);
        this.panel4.add(txtEditMoral);
        this.panel4.add(lblEditarUrl);
        this.panel4.add(txtEditUrl);

        btnActualizar = new JButton("Editar");
        this.panel4.add(btnActualizar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblPoder() {
        return lblPoder;
    }

    public void setLblPoder(JLabel lblPoder) {
        this.lblPoder = lblPoder;
    }

    public JLabel getLblEquipo() {
        return lblEquipo;
    }

    public void setLblEquipo(JLabel lblEquipo) {
        this.lblEquipo = lblEquipo;
    }

    public JLabel getLblMoral() {
        return lblMoral;
    }

    public void setLblMoral(JLabel lblMoral) {
        this.lblMoral = lblMoral;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPoder() {
        return txtPoder;
    }

    public void setTxtPoder(JTextField txtPoder) {
        this.txtPoder = txtPoder;
    }

    public JTextField getTxtEquipo() {
        return txtEquipo;
    }

    public void setTxtEquipo(JTextField txtEquipo) {
        this.txtEquipo = txtEquipo;
    }

    public JTextField getTxtMoral() {
        return txtMoral;
    }

    public void setTxtMoral(JTextField txtMoral) {
        this.txtMoral = txtMoral;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblXmen() {
        return tblXmen;
    }

    public void setTblXmen(JTable tblXmen) {
        this.tblXmen = tblXmen;
    }

    public JScrollPane getScrollpane() {
        return scrollpane;
    }

    public void setScrollpane(JScrollPane scrollpane) {
        this.scrollpane = scrollpane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JTextField getTxtElimid() {
        return txtElimid;
    }

    public void setTxtElimid(JTextField txtElimid) {
        this.txtElimid = txtElimid;
    }

    public JLabel getLblEditarNom() {
        return lblEditarNom;
    }

    public void setLblEditarNom(JLabel lblEditarNom) {
        this.lblEditarNom = lblEditarNom;
    }

    public JLabel getLblEditarPod() {
        return lblEditarPod;
    }

    public void setLblEditarPod(JLabel lblEditarPod) {
        this.lblEditarPod = lblEditarPod;
    }

    public JLabel getLblEditarEqui() {
        return lblEditarEqui;
    }

    public void setLblEditarEqui(JLabel lblEditarEqui) {
        this.lblEditarEqui = lblEditarEqui;
    }

    public JLabel getLblEditarMor() {
        return lblEditarMor;
    }

    public void setLblEditarMor(JLabel lblEditarMor) {
        this.lblEditarMor = lblEditarMor;
    }

    public JLabel getLblEditarUrl() {
        return lblEditarUrl;
    }

    public void setLblEditarUrl(JLabel lblEditarUrl) {
        this.lblEditarUrl = lblEditarUrl;
    }

    public JTextField getTxtEditNom() {
        return txtEditNom;
    }

    public void setTxtEditNom(JTextField txtEditNom) {
        this.txtEditNom = txtEditNom;
    }

    public JTextField getTxtEditPod() {
        return txtEditPod;
    }

    public void setTxtEditPod(JTextField txtEditPod) {
        this.txtEditPod = txtEditPod;
    }

    public JTextField getTxtEditEquip() {
        return txtEditEquip;
    }

    public void setTxtEditEquip(JTextField txtEditEquip) {
        this.txtEditEquip = txtEditEquip;
    }

    public JTextField getTxtEditMoral() {
        return txtEditMoral;
    }

    public void setTxtEditMoral(JTextField txtEditMoral) {
        this.txtEditMoral = txtEditMoral;
    }

    public JTextField getTxtEditUrl() {
        return txtEditUrl;
    }

    public void setTxtEditUrl(JTextField txtEditUrl) {
        this.txtEditUrl = txtEditUrl;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtPoder.setText("");
        txtEquipo.setText("");
        txtMoral.setText("");
        txtUrl.setText("");

    }

    public void limpiar2(){
        txtEditNom.setText("");
        txtEditPod.setText("");
        txtEditEquip.setText("");
        txtEditMoral.setText("");
        txtEditUrl.setText("");
    }
}
