import java.util.Scanner;

public class ChefInHisOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int totalHours = x*4 + y;

            System.out.println(totalHours);
        }
        sc.close();
    }
}
