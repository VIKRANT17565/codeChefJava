import java.util.Arrays;
import java.util.Scanner;

public class PointsAndLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x[] = new int[n];
            int y[] = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }

            Arrays.sort(x);
            Arrays.sort(y);

            int xp = -1;
            int yp = -1;
            int xCount = 0;
            int yCount = 0;
            for (int i = 0; i < n; i++) {
                if (xp != x[i]) {
                    xp = x[i];
                    xCount++;
                }
                if (yp != y[i]) {
                    yp = y[i];
                    yCount++;
                }
            }

            System.out.println(xCount+yCount);

        }
        sc.close();
    }
}
