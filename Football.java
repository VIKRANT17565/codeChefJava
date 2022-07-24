import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int score[] = new int[n];
            int mvp = 0;

            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
                score[j] += a[j]*20;
            }

            for (int j = 0; j < b.length; j++) {
                b[j] = sc.nextInt();
                score[j] -= b[j]*10;

                if (mvp < score[j]) {
                    mvp = score[j];
                }
            }

            System.out.println(mvp);

            
        }
        sc.close();
    }
}
