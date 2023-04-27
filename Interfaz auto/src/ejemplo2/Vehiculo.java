package ejemplo2;

public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';

    public boolean encender();
    public boolean apagar();
    public void frenar();
    public void avanzar();

}
