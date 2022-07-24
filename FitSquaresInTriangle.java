import java.util.Scanner;

public class FitSquaresInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();

            int base = n;
            base = (base - 2);

            base = base/2;

            base = base * (base + 1)/2;

            System.out.println(base);
        }
        sc.close();
    }
}
