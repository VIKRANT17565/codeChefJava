import java.util.Scanner;

public class StringProtocol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            int time = 0;
            int i = 0;
            while (i < n) {
                if (i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                    i += 2;
                }
                else{
                    i++;
                }
                time++;
            }
            System.out.println(time);

        }
        sc.close();
    }
}
