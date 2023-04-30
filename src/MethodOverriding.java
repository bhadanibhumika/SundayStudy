public class MethodOverriding {
    void marriage(){

        System.out.println("you should marry a white girl");
    } void forcemrg(){
        System.out.println("This is our final decision");
    }
    void m1(int a,int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.marriage();
    }
}
