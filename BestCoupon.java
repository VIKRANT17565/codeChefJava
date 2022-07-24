import java.util.Scanner;

public class BestCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int dis = x/10;

            System.out.println(dis);

            if (dis > 100) {
                System.out.println(dis);
            }
            else{
                System.out.println(100);
            }
        }
        sc.close();
    }
}
