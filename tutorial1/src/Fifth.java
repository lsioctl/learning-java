public class Fifth {
    // this

    int age;
    String kudo;

    Fifth(int age, String kudo) {
        // without this we would have had to rename the vars
        // like age = vage;
        this.age = age;
        this.kudo = kudo;
    }

    private void show(){
        System.out.println(age + " " + kudo);
    }

    public static void main(String[] args) {
        Fifth fifth = new Fifth(25, "Yeaaaah");
        fifth.show();

    }
}
