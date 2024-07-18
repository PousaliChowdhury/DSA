//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                isAscending = false;
            }
        }

        if(isAscending)
            System.out.println("Sorted in ascending order");
        else
            System.out.println("Not sorted in ascending order");
    }
}
