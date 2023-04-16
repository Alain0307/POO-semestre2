public class Main {
    public static void main(String[] args) {

       Vehiculo ve = new Vehiculo("Volskwagen", 4, "terrestre");
        System.out.println(ve);
        ve.encender();
        ve.apagar();

        Automovil auto = new Automovil(
                "Volskwagen",
                4,
                "terrestre",
                "Eléctrico",
                2014,
                "Jetta"
        );
        System.out.println(auto);
        auto.encender();
        auto.abrirVentana();
        auto.cerrarVentana();
        auto.apagar();

        Taxi tax1 = new Taxi(
                "Volskwagen",
                4,
                "Terrestre",
                "Eléctrico",
                2014,
                "Jetta",
                "Uber",
                true,
                "Negro"
        );
        System.out.println(tax1);
        tax1.encender();
        tax1.abrirVentana();
        tax1.iniTaxi();
        tax1.cobrar();
        tax1.apagar();
    }
}