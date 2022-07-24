import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            String output = "";
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (k - a[j] >= 0) {
                    k -= a[j];
                    output += "1";
                }
                else{
                    output += "0";
                }
            }

            System.out.println(output);
            
        }
        sc.close();
    }
}
