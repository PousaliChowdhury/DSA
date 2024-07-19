//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class StringBuilders1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String b = s.next();
        StringBuilder a = new StringBuilder(b);

        for(int i=0; i<a.length(); i++){
            if(b.charAt(i) == 'e')
                a.setCharAt(i, 'i');
        }
        
        System.out.println(a);
    }
}
