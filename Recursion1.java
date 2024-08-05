public class Recursion1 {
    //Print number 5 to 1

    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
    public static void printNumber(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printNumber(n-1);
    }

    //Print number 1 to 5

//     public static void main(String[] args) {
//         int n = 1;
//         printNumber(n);
//     }
//     public static void printNumber(int n) {
//         if(n == 5){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         printNumber(n+1);
//     }
}
