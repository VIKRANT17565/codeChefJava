import java.util.Scanner;

public class PuppyAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int d = sc.nextInt();
            int n = sc.nextInt();

            int sumTilln = 0;
            for (int j = 0; j < d; j++) {
                for (int j2 = 0; j2 <= n; j2++) {
                    sumTilln += j2;
                }
                n = sumTilln;
                sumTilln = 0;
            }
            sumTilln = n;
            System.out.println("sumTilln : "+ sumTilln);
        }
        sc.close();
    }
}
