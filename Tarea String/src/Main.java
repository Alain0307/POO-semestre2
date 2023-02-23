

public class Main {
    public static void main (String[] args){
        String s = "Hola!";
        String s1 = "Hola";

        System.out.println("Cadena 1: " + s);
        System.out.println("Cadena 2: " + s1);

        int x = s.length();
        System.out.println("Longitud de la cadena: "+ x);

        boolean b1 = s.isEmpty();
        System.out.println("Esta vacio?: " + b1);

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }

        if(s.equals(s1)){
            System.out.println("Son iguales");
        }

        int p1 = s.indexOf('a');
        System.out.println("La letra a se encuentra en: " + p1);

        String may = s.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + may);

        String min = s.toLowerCase();
        System.out.println("Cadena en minúsculas: " + min);

        String s3 = "Hola, como estas?";
        System.out.println("Cadena 3: " + s3);

        String sub = s.substring(0,4);
        System.out.println("Subcadena de 0 a 4: " + sub);

        String u = s+s1;
        System.out.println("Las cadenas 1 y 2 son: " + u);

        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("profesor");
        System.out.println("Cadena de caracteres concatenada: " + sb);

        StringBuilder sb1 = new StringBuilder("Holaa");
        sb1.setCharAt(4, '!');
        System.out.println("Cadena con caracter modificado: " + sb1 );

    }
}