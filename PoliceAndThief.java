import java.util.Scanner;

public class PoliceAndThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long x = sc.nextInt();
            long y = sc.nextInt();

            long dif = Math.abs(x-y);

            System.out.println(dif);
            
        }
        sc.close();
    }
}
