
import java.util.Scanner;
public class Hw5 {
    public static void main(String[] args) {


    double a,b,c,sum,avarage;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter first value= ");
    a= input.nextDouble();
    System.out.print("Enter second  value= ");
    b= input.nextDouble();
    System.out.print("Enter third  value= ");
    c= input.nextDouble();
          sum=a+b+c;
          System.out.println("The sum is = "+sum);
          avarage=sum/3;
          System.out.println("The avarage is = "+avarage);
    }
}
