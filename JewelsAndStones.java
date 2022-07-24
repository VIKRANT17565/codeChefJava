import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            String j = sc.next();
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (j.contains(s.substring(i, i+1))) {
                    count++;
                }
            }


            System.out.println(count);

        }
        sc.close();
    }
}
