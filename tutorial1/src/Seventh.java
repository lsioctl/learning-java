public class Seventh {
    // casting

    public static void main(String[] args) {

        int myInt = 9;
        // automatic widening casting
        double myDouble = myInt;

        // narowing casting must be done manually
        double myDouble2 = 9.18;
        int myInt2 = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt2);

    }
}
