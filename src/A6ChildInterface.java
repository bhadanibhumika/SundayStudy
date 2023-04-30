public class A6ChildInterface implements PrintableParentInterface {


    // normal method
    public void print(){
        System.out.println("Hello");
    }
    //main method

    public static void main(String[] args) {
        // create child class obj
        A6ChildInterface a6ChildInterface = new A6ChildInterface();
        a6ChildInterface.print();// calling method print
    }


}
