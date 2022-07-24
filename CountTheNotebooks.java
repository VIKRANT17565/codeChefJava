import java.util.Scanner;

public class CountTheNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            System.out.println(n*10);
        }
        sc.close();
    }
}
