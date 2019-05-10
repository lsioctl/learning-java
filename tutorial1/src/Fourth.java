public class Fourth {
    // modifiers
    // public is an access modifier for the class
    // no non access modifier

    // public access modifier
    // static non access modifier
    public static void myStaticMethod() {
        // static method can be called from the class
        System.out.println("Amazing static");
    }

    // public access modifier
    // no non access modifier
    public void myPubMethod(){
        // public method can be called only by objects
        System.out.println("Amazing public");
    }

    public static void main(String[] args) {
        myStaticMethod();
        Fourth myClass = new Fourth();
        myClass.myPubMethod();
    }
}
