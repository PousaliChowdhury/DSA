package BitManipulation;

import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        int n = 5; // 0101 
        // int n = 8; // 1000 
        int i = 1; // 0011 
        int BitMask = 1<<i; 
        // For 5 --> 0001 --> 0010 --> 0101 OR 0010 --> 0111
        // For 8 --> 0001 --> 0010 --> 1000 OR 0010 --> 1010

        int newNumber = BitMask | n;
        System.err.println(newNumber);
    }
}
