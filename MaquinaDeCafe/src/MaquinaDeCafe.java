public class MaquinaDeCafe {

    private int agua;
    private int cafe;
    private int crema;
    private int vasos;


    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public void Americano(){
        if(this.agua >= 180 && this.cafe >= 15 && this.vasos > 0){
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos --;
            System.out.println("El Americano está listo");
            this.estado();
        }else{
            System.out.println("No se puede servir un Americano :(");
        }
    }

    public void Expresso(){
        if(this.agua >= 120 && this.cafe >= 20 && this.vasos >0){
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos --;
            System.out.println("El expreso está listo");
            this.estado();
        }else{
            System.out.println("No se puede servir un expreso :(");
        }
    }

    public void Capuchino(){
        if(this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0 ){
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos --;
            System.out.println("El Capuchino está listo");
            this.estado();
        }else{
            System.out.println("No se puede servir un Capuchino :(");
        }
    }

    public void estado(){
        System.out.println("Agua: " + this.agua + "ml");
        System.out.println("Café: " + this.cafe + "g");
        System.out.println("Crema: " + this.crema + "ml");
        System.out.println("Vasos: " + this.vasos);
    }
}
