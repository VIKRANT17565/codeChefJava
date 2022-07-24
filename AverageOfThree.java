import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int a = n-1;
            int b = n+1;
            System.out.println(a +" "+ n +" "+ b);
        }
        sc.close();
    }
}
