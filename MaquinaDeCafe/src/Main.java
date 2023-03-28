public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe maq1 = new MaquinaDeCafe();

        maq1.estado();

        maq1.Americano();
        maq1.Americano();
        maq1.Americano();

        maq1.Expresso();

        maq1.Capuchino();
        maq1.Capuchino();
        maq1.Capuchino();
        maq1.Capuchino();
        maq1.Capuchino();

        maq1.estado();
    }
}