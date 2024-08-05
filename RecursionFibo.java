import java.util.Scanner;

public class RecursionFibo {

    public static void printFibo(int a, int b, int n) {
        if(n==0)
            return;
        int c = a+b;
        System.out.println(c);
        printFibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 1;
        int n = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        printFibo(a, b, n-2); //already first two terms are printed
    }
}
