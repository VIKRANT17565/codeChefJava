// import java.util.Arrays;
import java.util.Scanner;

public class AntiPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            char c[] = s.toCharArray();
            int alp[] = new int[26];

            for (int i = 0; i < n; i++) {
                alp[c[i]-97]++;
            }

            String r = isAntiPalindrome(n, c);

            System.out.println(r);
            if (r == "YES") {
                for (int i = 0; i < n; i++) {
                    System.out.print(c[i]+" ");
                }System.out.println();
            }

        }
        sc.close();
    }

    private static String isAntiPalindrome(int n, char[] c) {
        if (n%2 != 0) {
            return "No";
        }

        // Arrays.sort(c);
        // for (char d : c) {
        //     System.out.println(d);
        // }

        for (int i = 0; i < n/2; i++) {
            // System.out.println(c[i] +" "+c[n-1-i]);
            if (c[i] == c[n-1-i]) {
                return "NO";
            }
        }

        return "YES";
    }
}
