import java.util.Scanner;

public class CarelessChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int oddCount = 0;
            int b[] = new int[2*n];
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
                if (b[i]%2 != 0) {
                    oddCount++;
                }
            }

            if (oddCount%2 != 0) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
