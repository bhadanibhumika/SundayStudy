import java.util.Scanner;

public class SwitchMonth {
    // main method
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in); // create scanner class
        // print for user
        System.out.println("Enter Month number: ");
        int month = scanner.nextInt(); // create  variable n using scanner obj

// switch statement
        switch (month){
            // case statement
            case 1:
                System.out.println(" 1 - january");
             // break for case 1
            break;
              case 2:
                System.out.println(" 2 - february ");
                break;
            case 3:
                System.out.println(" 3 - March");
                break;
            case 4:
                System.out.println(" 4 - April");
                break;
            case 5:
                System.out.println(" 5 - May");
                break;
            case 6:
                System.out.println(" 6 - June");
                break;
            case 7:
                System.out.println(" 7 - July");
                break;
            case 8:
                System.out.println(" 8 - August");
                break;
            case 9:
                System.out.println(" 9 - September");
                break;
            case 10:
                System.out.println(" 10 - October");
                break;
            case 11:
                System.out.println(" 11 - November");
                break;
            case 12:
                System.out.println(" 12 - December");
                break;
            default:
                System.out.println(month+ " invalid number");
        }

    }
}
