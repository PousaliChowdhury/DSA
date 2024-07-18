//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String a[] = new String[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.next();
        }
        for(int i=0; i<a.length; i++){
            System.out.println("Name " + (i+1) + " is " + a[i]);
        }
    }
}
