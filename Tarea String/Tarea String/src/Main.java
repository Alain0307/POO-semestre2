import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre, profesión y nacionalidad: ");
        String cad = scan.nextLine();

        String[] subcadenas = cad.split(" ");

        String nombre = subcadenas[0];

        String prof = subcadenas[1];

        String nac = subcadenas[2];

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + prof);
        System.out.println("Nacionalidad: " + nac);
    }
}