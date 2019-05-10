public class Third {
    // Constructor basics

    int personAge;
    String personKudo;

    public Third(int age, String kudo) {
        personAge = age;
        personKudo = kudo;
    }

    public static void main(String[] args) {
        Third myThird = new Third(25, "Awesome dude !");
        System.out.println(myThird.personAge + " " +  myThird.personKudo);
    }
}
