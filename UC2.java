package Com.Day4_RFP;
import java.util.Scanner;
public class UC2 {
    public static void main(String[] args) {
        /*I want to check equality of two lines based on the end points, So
        that I know when two lines are the equal.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st length of line: ");
        float len1 = sc.nextFloat();
        System.out.print("Enter the 2nd length of line: ");
        float len2 = sc.nextFloat();

        if (len1==len2){
            System.out.println("lines are the equal");
        }
        else{
            System.out.println("lines are not equal");
        }

    }
}
