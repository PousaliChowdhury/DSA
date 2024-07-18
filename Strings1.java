//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String result = "";

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == 'e')
                result += "i";
            else    
                result += a.charAt(i);
        }
        
        System.out.println(result);
    }
}
