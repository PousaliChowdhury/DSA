package BitManipulation;

import java.util.*;

public class GetBit {
    public static void main(String[] args) {
        // int n = 5; // 0101 
        int n = 8; // 1000 
        int i = 3; // 0011 
        int BitMask = 1<<i; 
        // For 5 --> 0001 --> 1000 --> 0101 AND 1000 --> 0000
        // For 8 --> 0001 --> 1000 --> 1000 AND 1000 --> 1000

        if((BitMask & n) == 0)
            System.err.println("BitMask is zero");
        else
            System.err.println("BitMask is non-zero");
    }
    
}