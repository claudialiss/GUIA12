public class Cactus extends Planta {
    public String tipo = "CACTUS";

    public static String clima() {
        return "desertico";
    }

    @Override
    public String regar() {
        return "cada 15 dias";
    }
}
