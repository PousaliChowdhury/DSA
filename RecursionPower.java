import java.util.Scanner;

public class RecursionPower {
    public static int calcPower(int x, int n){
        //x^n
        if(n == 0)//base case 1
            return 1;// as x^0=1
        if(x == 0)//base case 2
            return 0;// as 0^n=0
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(calcPower(x,n));
    }
}
