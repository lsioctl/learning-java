public class Eighth {
    // Exceptions

    public static void main(String[] args) {

        try {
            int[] myN = {1, 2, 3};
            System.out.println(myN[5]);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("We always get there");
        }

    }

}
