import java.util.Scanner;

public class IsTheScoreConsistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a <= c && b <= d) {
                System.out.println("POSSIBLE");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
        sc.close();
    }    
}
