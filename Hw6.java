import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
public class Hw6 {
    public static void main(String[] args) {
        String s="Hellow",t="word";
        System.out.println();
        System.out.println(s.length()+t.length());
        System.out.println(s.substring(1,2));
        s.substring(s.length()/2,s.length());
        System.out.println(s+t);
        System.out.println(t+s);

    }
}
