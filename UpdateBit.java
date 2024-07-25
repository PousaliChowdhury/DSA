package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int operation = s.nextInt(); //update operation in 1 or else in 0

        int n = 5; // 0101 
        int i = s.nextInt(); 
        int BitMask = 1<<i; 

        //Clear --> to update 0
        // For 5 --> 0001 --> 0010 --> 0101 AND NOT(0010) --> 0101 AND 1101 --> 0101
        if(operation == 0){
            int negBitMask = ~BitMask;
            int newNumber = negBitMask & n;
            System.err.println(newNumber);
        }

        //Set --> to update 1
        // For 5 --> 0001 --> 0010 --> 0101 OR 0010 --> 0111
        else{
            int newNumber = BitMask | n;
            System.err.println(newNumber);
        }
        
        
        
        
        
        
    }
}
