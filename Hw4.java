import java.util.Scanner;
public class Hw4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first value= ");
        a= input.nextInt();
        System.out.print("Enter second  value= ");
        b= input.nextInt();
        c=b;
        b=a;
        a=c;
        System.out.println("after swap ");
        System.out.println(" first value is = "+a);
        System.out.println(" second value is = "+b);
    }
}
