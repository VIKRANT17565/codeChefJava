import java.util.Scanner;

public class DistinctBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            String ps = "";
            for (int i = 0; i < n; i++) {
                String ns = s.substring(i, i+1);
                if (!ns.equals(ps)) {
                    ps = ns;
                    count++;
                }
            }

            System.out.println(count);

        }
        sc.close();
    }
}
