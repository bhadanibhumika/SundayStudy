public class RactangleChildAbs extends ShapeParentAbs{

    //normal method
    void draw(){
        System.out.println("drawing rectangle");

    }
//main method
    public static void main(String[] args) {
        ShapeParentAbs shapeParentAbs = new RactangleChildAbs();
        shapeParentAbs.draw();


    }
}
