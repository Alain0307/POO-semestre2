package clases2;

public class giroscopio {
    private Integer angulo;
    private double velocidad;
    private boolean sensor;

    public giroscopio() {
    }

    public giroscopio(Integer angulo, double velocidad, boolean sensor) {
        this.angulo = angulo;
        this.velocidad = velocidad;
        this.sensor = sensor;
    }

    public Integer getAngulo() {
        return angulo;
    }

    public void setAngulo(Integer angulo) {
        this.angulo = angulo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isSensor() {
        return sensor;
    }

    public void setSensor(boolean sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "giroscopio{" +
                "angulo=" + angulo +
                ", velocidad=" + velocidad +
                ", sensor=" + sensor +
                '}';
    }

    public void medirVelocidad(){
        System.out.println("Midiendo velocidad...");
    }

    public void encender(){
        System.out.println("Encendiendo giroscopio...");
    }

    public void apagar(){
        System.out.println("Giroscopio apagado");
    }
}
