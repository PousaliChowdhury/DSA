//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String a[] = new String[size];

        int TotalLength = 0;

        //concat
        for(int i=0; i<a.length; i++){
            a[i] = sc.next();
            TotalLength += a.length;
        }

            System.out.println(TotalLength);        
    }
}
