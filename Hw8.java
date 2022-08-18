import java.util.Scanner;
import java.util.*;
public class Hw8 {
    public static void main(String[] args) {
        int a,power;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number = ");
        a= input.nextInt();
        System.out.println("The square= "+(a*a));
        System.out.println("The cube= "+(a*a*a));
        System.out.println("The power of is = "+Math.pow(a,4));

    }
}
