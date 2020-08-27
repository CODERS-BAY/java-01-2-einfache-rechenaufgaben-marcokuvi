public class SimpleCalculations {
    public static void main (String [] args) {
        int a = 27;
        int b = 45;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        double c = 23.59;
        double d = 36.73;

        System.out.println(Math.round((c + d) * 100.0) / 100.0);
        System.out.println(Math.round((c - d) * 100.0) / 100.0);
        System.out.println(Math.round((c * d) * 100.0) / 100.0);
        System.out.println(Math.round((c / d) * 100.0) / 100.0);


    }
}
