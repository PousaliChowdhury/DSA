//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.next();
        String userName = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@')
                break;
            else
                userName += email.charAt(i);
        }

        System.out.println(userName);
    }
}
