import java.util.Scanner;

public class ValentineIsComing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {

            int x = sc.nextInt();   //amount chef has

            int y = sc.nextInt();   //cost of choco

            int count = 0;
            int i = y;

            while (i <= x) {
                i += y;
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
