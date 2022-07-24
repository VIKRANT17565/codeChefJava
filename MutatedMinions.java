import java.util.Scanner;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt() + k;
                if (arr[j]%7 == 0) {
                    count++;
                }
            }

            System.out.println(count);
            

        }
        sc.close();
    }
}
