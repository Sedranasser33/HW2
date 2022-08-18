
public class Hw10 {
    public static void main(String[] args) {


    int a=20,b=25,difference,distance,prodect;
    double average,sum;

    sum=a+b;
    difference=a-b;
    prodect=a*b;
    average=sum/2;
    distance=difference;
        System.out.println(" sum:             "+sum);
        System.out.println("difference:       "+difference);
        System.out.println("prodect:          "+prodect);
        System.out.println("average:         "+average);
        if(distance>0){ System.out.println("distance:          "+difference);}
        if(distance<0){ System.out.println("distance:          "+(-1*difference));}
        if (a>b) {   System.out.println("The Maximum:      "+a);  }
        if (b>a) {   System.out.println("The Maximum:      "+b);}
        if (a<b) {   System.out.println("The Minimum:      "+a);  }
        if (b<a) {   System.out.println("The Minimum:      "+b);}
    }
}
