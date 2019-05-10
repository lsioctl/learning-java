// prepare for the Tenth class
package mypack;

public class Ninth {
    // encapsulation

    // this is a nested class for the Tenth class
    public static class Example {
        // private so not accessible outside the class
        private int myInt = 20;

        // this is a public getter;
        public int getMyInt() {
            return myInt;
        }

        // and a public ... guess what ;)
        public void setMyInt(int myInt) {
            this.myInt = myInt;
        }
    }

    public static void main(String[] args) {
        Example ex = new Example();

        // this is not possible
        // System.out.println(ex.int);
        ex.setMyInt(21);
        System.out.println(ex.getMyInt());
    }
}


