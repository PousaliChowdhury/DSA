//Input 2 Strings and compare that they are similar or not.

import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();

        if(a.compareTo(b) == 0)
            System.out.println("String matched");
        else    
            System.out.println("String not matched");
    }
}

