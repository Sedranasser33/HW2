import java.util.Scanner;
public class Hw9 {
    public static void main(String[] args) {
        int a,b,sum,difference,distance,prodect;
        double average;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first value= ");
        a= input.nextInt();
        System.out.print("Enter second  value= ");
        b= input.nextInt();
        sum=a+b;
        difference=a-b;
        prodect=a*b;
        average=sum/2;
        distance=difference;
        System.out.println("sum= "+sum);
        System.out.println("difference  = "+difference);
        System.out.println("average = "+average);
        if(distance>0){ System.out.println("distance= "+difference);}
        if(distance<0){ System.out.println("distance= "+(-1*difference));}
        if (a>b) {   System.out.println("The Maximum= "+a);  }
        if (b>a) {   System.out.println("The Maximum= "+b);  }
        if (a<b) {   System.out.println("The Minimum= "+a);  }
        if (b<a) {   System.out.println("The Minimum= "+b);  }
    }
}
