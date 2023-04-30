public class ForLoopPractice {

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println("outer: "+i);

            for (int j=1;j<=7;j++)
            System.out.println("inner: "+j);

        }
    }
}
