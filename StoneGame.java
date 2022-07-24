import java.util.Arrays;
import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            String s = "";
            char ac[] = a.toCharArray();
            Arrays.sort(ac);
            char bc[] = b.toCharArray();
            Arrays.sort(bc);

            char str[] = new char[2*n];


            for (int i = 0; i < n; i += 2) {
                s += ac[i-(i/2)];
                str[i] = ac[i-(i/2)];
                s += bc[n-(i-(i/2))-1];
                str[i+1] = bc[n-(i-(i/2))-1];
            }

            for (int i = 2*n-1; i > -1; i -= 2) {
                
            }

            System.out.println(s);
        }
        sc.close();
    }
}
