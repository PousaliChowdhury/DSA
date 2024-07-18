//Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        //The actual value of Integer. MAX_VALUE is 231 -1 which is equivalent to 2147483647 and the actual value of Integer. MIN_VALUE is -231 which is equivalent to -2147483648.


        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>maximum)
                maximum = numbers[i];
                
            if(numbers[i]<minimum)
                minimum = numbers[i];
        }


        System.out.println("Largest no is: " + maximum);
        System.out.println("Smallest no is: " + minimum);
    }
}