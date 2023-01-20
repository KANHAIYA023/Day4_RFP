package Com.Day4_RFP;
import java.util.Scanner;
public class UC3 {
    public static void main(String[] args) {
        //one line is equal, greater or less than the other line.
        Scanner sc = new Scanner(System.in);
        System.out.print("1st length of line is: ");
        float len1 = sc.nextFloat();
        System.out.print("2nd length of line is: ");
        float len2 = sc.nextFloat();

        if (len1==len2){
            System.out.println("two line of length is equal");
        }
        else if (len1>len2){
            System.out.println("1st length is greater than 2nd length");
        }
        else{
            System.out.println("1st length is less than 2nd length");
        }
    }
}
