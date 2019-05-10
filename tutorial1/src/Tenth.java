import mypack.Ninth.Example;

public class Tenth {

    public static void main(String[] args) {
        // this import may be only possible for static
        // static import shortcut since Java 5
        Example ex = new Example();

        ex.setMyInt(21);
        System.out.println(ex.getMyInt());
    }
}
