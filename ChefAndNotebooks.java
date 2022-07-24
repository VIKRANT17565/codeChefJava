import java.util.Scanner;

public class ChefAndNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                if (x-y <= p && c <= k) {
                    f = true;
                }
            }
            if (f) {
                System.out.println("LuckyChef");
            }
            else{
                System.out.println("UnluckyChef");
            }
        }
        sc.close();
    }
}
