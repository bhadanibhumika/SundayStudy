public class A7childInterface implements DrawableParentInterface, ShowableParentInterface{ // child class multiple inheritance via interface

    // normal method
    public void draw(){
        System.out.println("Hello");

    }
    // normal method
    public void show(){
        System.out.println("Welcome");
    }
    // main method
    public static void main(String[] args){
        A7childInterface a7childInterface = new A7childInterface(); // create object
        a7childInterface.draw(); //calling Drawable parent class method
        a7childInterface.show();// calling showable parent class method
    }
}
