public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Dipsy Danger");
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        System.out.println(gipsyDanger);

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", 3, 10, 10);
        System.out.println(chernoAlpha);
    }
}