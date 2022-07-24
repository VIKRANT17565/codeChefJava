import java.util.Scanner;

public class AnotherPermutationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();

            if (n%2 != 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
