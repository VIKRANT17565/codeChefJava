import java.util.*;

public class TerboSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, n =sc.nextInt();
        int arr[] = new int[n];        // 3, 1, 2, 4
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Sorting
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (j = i+1; j < n; j++) {
                if (arr[index] > arr[j]){
                    index = j;
                }
            }
            //System.out.println("smallest : "+smallInt);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        // sorted array
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}
