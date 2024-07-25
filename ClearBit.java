package BitManipulation;

import java.util.*;

public class ClearBit {
    public static void main(String[] args) {
        // int n = 5; // 0101 
        int n = 8; // 1000 
        int i = 1; // 0011 
        int BitMask = 1<<i; 
        int negBitMask = ~BitMask;

        // For 5 --> 0001 --> 0010 --> 0101 AND NOT(0010) --> 0111
        // For 8 --> 0001 --> 0010 --> 1000 AND NOT(0010) --> 1010

        if((negBitMask & n) == 0)
            System.err.println("BitMask is zero");
        else
            System.err.println("BitMask is non-zero");
    
    }
}
