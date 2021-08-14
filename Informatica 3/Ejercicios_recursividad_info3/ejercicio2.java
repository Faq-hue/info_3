/**
 * ejercicio2
 */
public class ejercicio2 {

    public static void main(String[] args) {
        try {

            System.out.println(power(2, 3));

        } catch (Exception e) {
            System.out.println("Exception in:");
            e.printStackTrace();
        }

    }

    public static int power(int base, int exp) throws Exception {

        if (exp < 0) {
            throw new Exception("exp cannot be minnor to 0");
        }

        return exp == 0? 1: base* power(base, exp - 1);

    }
}