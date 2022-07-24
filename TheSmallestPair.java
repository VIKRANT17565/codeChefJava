import java.util.Scanner;

public class TheSmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for (int k = 0; k < n-1; k++) {
                int index = k;
                for (int l = k+1; l < n; l++) {
                    if (arr[index] > arr[l]){
                        index = l;
                    }
                }
                int temp = arr[k];
                arr[k] = arr[index];
                arr[index] = temp;
            }

            System.out.println(arr[0]+arr[1]);

        }
        sc.close();
    }
}
