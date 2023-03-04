import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char hz = (char)95;
        char vr = (char)124;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una cadena de 9 caracteres: ");
        String cadenaGato = teclado.nextLine();

        System.out.println("La cadena para jugar gato es: " + cadenaGato + "\n");

        String[] subcadenasGato = cadenaGato.split("");

        System.out.println(""+ hz + hz + hz + hz + hz + hz + hz + hz);

        System.out.println("" + vr + " " + subcadenasGato[0] + " " + subcadenasGato[1] + " " + subcadenasGato[2] + "" + vr);
        System.out.println("" + vr + " " + subcadenasGato[3] + " " + subcadenasGato[4] + " " + subcadenasGato[5] + "" + vr);
        System.out.println("" + vr + " " + subcadenasGato[6] + " " + subcadenasGato[7] + " " + subcadenasGato[8] + "" + vr);

        System.out.println(""+ hz + hz + hz + hz + hz + hz + hz + hz);
    }
}