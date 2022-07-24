import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int r = sc.nextInt();

            int a,b;
            boolean isSolved = false;

            for (int i = 0; i <= n; i++) {
                a = i;
                b = n-a;

                if((x*a + y*b) <= r){
                    System.out.println(a+" "+b);
                    isSolved = true;
                    break;
                }
            }

            if (!isSolved) {
                System.out.println(-1);
            }

        }
        sc.close();
    }
}
