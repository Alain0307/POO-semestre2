import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblgenero;
    private JLabel lblpeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtpeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tbltabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(79, 167, 18));
        lblId = new JLabel("Id");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblgenero = new JLabel("Género:");
        txtGenero = new JTextField(15);
        panel1.add(lblgenero);
        panel1.add(txtGenero);

        lblpeso = new JLabel("Peso (Gb):");
        txtpeso = new JTextField(5);
        panel1.add(lblpeso);
        panel1.add(txtpeso);

        lblPlataforma = new JLabel("Plataforma");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblDesarrollador = new JLabel("Desarrollador");
        txtDesarrollador = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);

        btnAgregar = new JButton("Agregar juego");
        panel1.add(btnAgregar);

        this.getContentPane().add(panel1, 0);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(60, 8, 68));

        info = new ArrayList<>();
        info.add(new Videojuego(1,
                "League of Legends",
                "MOBA",
                4.5,
                "Windows",
                "Riot"));

        modelo = new ModeloTablaJuego(info);

        tbltabla = new JTable(modelo);

        scroll = new JScrollPane(tbltabla);

        panel2.add(scroll);


        this.getContentPane().add(panel2, 1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego nuevo = new Videojuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoenGb(Double.parseDouble(txtpeso.getText()));
                nuevo.setPlatafroma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrollador.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tbltabla.updateUI();
            }
        });

        this.setVisible(true);
    }
}
