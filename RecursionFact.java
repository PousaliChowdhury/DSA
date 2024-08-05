import java.util.Scanner;

public class RecursionFact {
    public static int calcFact(int n){
        if(n == 1 || n == 0)
            return 1;
        int fact_nm1 = calcFact(n-1);
        int fact_n = fact_nm1 * n;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        System.out.println(calcFact(n));
    }
}
