import java.util.Scanner;
import java.util.Locale;
import java.util.*;
public class Hw7 {
    public static void main(String[] args) {
        String s="Sedra";
        System.out.println(s);

         // طباعة الحرف الاول
        System.out.println(s.charAt(0));
        // ازاله الحرف الاول
        System.out.println(s.substring(1));
        //طباعة الحرف الاخير
        System.out.println(s.charAt(4));
        //حذف الاخير
        System.out.println(s.replaceAll("a",""));

    }
}
