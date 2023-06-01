import Controlador.ControladorCompu;
import Vista.VentanaComputadora;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        VentanaComputadora ventana = new VentanaComputadora("Ejemplo MVC 2");
        ControladorCompu controller = new ControladorCompu(ventana);

    }
}