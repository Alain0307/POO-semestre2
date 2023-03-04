import java.awt.*;

public class Test {
    public static void main(String[] args){

        Automovil auto1 = new Automovil("VW", "Jetta", (byte)15, Color.black);
        System.out.println(auto1);
        auto1.encender();
        auto1.apagar();
        auto1.avanzar();

        Persona per1 = new Persona("Oliver", 23, 1.76, "M", 67);
        System.out.println(per1);
        per1.comer();
        per1.baniar();
        per1.dormir();

        Monitor moni1 = new Monitor(28.0, "LENOVO", "LN900", "LED");
        System.out.println(moni1);
        moni1.apagar();
        moni1.encender();
        moni1.proyectar();

        Telefono tel1= new Telefono("REALME", "REALME 7 5G", 7, 128, (byte)8);
        System.out.println(tel1);
        tel1.apagado();
        tel1.reinicio();
        tel1.carga();


    }
}
