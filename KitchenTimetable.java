import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            int b[] = new int[n];
            int c[] = new int[n];
            int count = 0;

            for (int j = 1; j < n+1; j++) {
                a[j] = sc.nextInt();
                c[j-1] = a[j] - a[j-1];
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                if (c[j] >= b[j]) {
                    count++;
                }
            }
            System.out.println(count);
            
        }
        sc.close();
    }
}
