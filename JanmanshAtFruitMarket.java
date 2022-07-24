import java.util.Scanner;

public class JanmanshAtFruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int minP;
            int r1, r2;
            if (a < b) {
                if (a < c) {
                    minP = a;
                    r1 = b;
                    r2 = c;
                }
                else{
                    minP = c;
                    r1 = b;
                    r2 = a;
                }
            }
            else{
                if (b < c) {
                    minP = b;
                    r1 = c;
                    r2 = a;
                }
                else{
                    minP = c;
                    r1 = b;
                    r2 = a;
                }
            }

            int otherMinP = r1 < r2 ? r1 : r2;

            int finalP = (x-1)*minP + otherMinP;

            System.out.println(finalP);

        }
        sc.close();
    }
}
