public class Sixth {
    // learning of super and usage of main
}

// we can't make this class public
// as the name different from the filename
class Employee {

    int wt = 8;
}

class AwesomeEmployee extends Employee {

    int wt = 20;

    void show() {
        System.out.println(super.wt);
    }

    // here main is on AwsomeEmployee
    // if out we have errors like
    // non-static method cannot be referenced from a static context

    public static void main(String[] args) {
        AwesomeEmployee ae = new AwesomeEmployee();
        ae.show();

    }

}
