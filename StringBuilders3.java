//Take a String and reverse it

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Nilandra");
        // Char a = s.next();
        
        for(int i=0; i<a.length()/2; i++){
            int front = i;
            int back = a.length() - i - 1;

            char frontChar = a.charAt(front);
            char backChar = a.charAt(back);

            a.setCharAt(front, backChar);
            a.setCharAt(back, frontChar);
        }

        System.out.println(a);
    }
}
