package Practice;

public class Main {
    public static void main(String[] args) {
        try {
            Complex ab1 = new Complex(2, 3);
            Complex ab2 = new Complex(4, 5);
            Complex ab3 = ab1.add(ab2);
            System.out.println(ab3.toString());

            Complex ab4 = ab1.subtract(ab2);
            System.out.println(ab4.toString());

            Complex ab5 = ab1.multiply(ab2);
            System.out.println(ab5.toString());

            Complex ab6 = ab1.divide(ab2);
            System.out.println(ab2.toString());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}