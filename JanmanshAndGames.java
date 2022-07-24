import java.util.Scanner;

public class JanmanshAndGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ar = x+y;           //Assumed result
            if (ar%2 == 0) {
                System.out.println("Janmansh");
            }
            else{
                System.out.println("Jay");
            }
        }
        sc.close();
    }
}
