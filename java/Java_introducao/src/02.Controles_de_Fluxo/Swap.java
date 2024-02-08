public class Swap {
    public static void main(String[] args) {
        String x = "oi";
        String y = "Olá";

        System.out.println("x tem o valor: "+x);
        System.out.println("y tem o valor: "+y);

        String temp = null;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x tem o valor: "+x);
        System.out.println("y tem o valor: "+y);

    }
}
