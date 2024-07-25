public class InsertionSort {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int size = s.nextInt();
        // int arr[] = new int[size];
        int arr[] = {7,8,3,1,2};

        //Time Complexity = O(n^2)
        //Insertion Sort
        for(int i=0; i<arr.length; i++){
            int current = arr[i];   //i denoted the index of unsorted part
            int j = i-1;            //j denoted the index of sorted part

            //acending
            // while(j >= 0 && current < arr[j]){ 
            //     arr[j+1] = arr[j];
            //     j--;
            // }

            //decending
            while(j >= 0 && current > arr[j]){ 
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
