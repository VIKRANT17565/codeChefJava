import java.util.Scanner;

public class ChefAndDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[100000];

            for (int j = 0; j < n; j++) {
                int type = sc.nextInt();
                arr[type]++;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%2 != 0) {
                    System.out.print(j+" ");
                }
            }System.out.println();
        }
        sc.close();
    }
}
