public class HondachildAbs extends BikeParentAbs {

    //normal non-static method
    void run()
    {
        System.out.println("running safely");
    }
    //main method
    public static void main(String[] args){
        //type casting
        BikeParentAbs bikeParentAbs = new HondachildAbs();//assigning child class method to parent class
        bikeParentAbs.run();// calling non-static method in to static aria

    }
}
