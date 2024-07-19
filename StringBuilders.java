//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String a[] = new String[size];
        StringBuilder b = new StringBuilder();

        for(int i=0; i<a.length; i++){
            a[i] = s.next();
            b.append(a[i]);
        }

        System.out.println(b.length());

    }
} 