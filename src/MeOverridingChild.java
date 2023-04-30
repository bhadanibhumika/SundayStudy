public class MeOverridingChild extends MethodOverriding {
    void marriage(){

        System.out.println("I will marry a black girl");
    } void m1(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MeOverridingChild meOverridingChild = new MeOverridingChild();
        meOverridingChild.marriage();
        meOverridingChild.forcemrg();
        meOverridingChild.m1(10,20);




    }
}
