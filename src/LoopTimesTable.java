import java.util.Scanner;

public class LoopTimesTable {

    //main method
    public static void main(String[] args) {
        // create scanner class object
        Scanner scanner = new Scanner(System.in);
        // print for user
        System.out.println("Enter any number:");
        // create variable and using scanner obj
        int a = scanner.nextInt();

        //for loop syntax
        for (int i = 1; i <= 12; i++) {

            System.out.println(a + "x" + i + "=" + (i * a));// print for multiplication
        }

    }
}