//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.Scanner;

public class StringBuilders2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        StringBuilder b = new StringBuilder(a);

        for(int i=0; i<b.length(); i++){
            if(a.charAt(i) == '@')
                b.delete(i, b.length());
        }

        System.out.println(b);
    }
}
