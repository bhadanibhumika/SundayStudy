public class Test01 {
    // no return type, no parameter
    public void m1() {   //first method
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
    //no return type, with parameter
    public void m1(int a,int b,int c){  // second method
        System.out.println(a+b+c);
    }
    public void m1(int x,int y,int z,int e){ // 3rd method
        System.out.println(x+y/z*e);
    } void mi(String name,String surname){ // 4th method
        System.out.println(name+" "+surname);
    }
    public static void main(String[] args) { //main method
        Test01 test01 = new Test01(); //  create obj for static method
        test01.m1(10,20,30); // second method
        test01.m1(10,20,100);  // second method
        test01.m1();                   // first method
        test01.m1(40,70,90); // second method
        test01.m1(10,20,5,8);// 3rd method
        test01.mi("bhumi","bhadani"); // 4th method
        test01.mi("dipti","rupareliya"); // 4th method
    }
}

