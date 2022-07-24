import java.util.Scanner;

public class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int total = a+b+c;

            int max = 0;
            String win = "";
            if (a > b && a > c) {
                max = a;
                win = "A";
            }
            else if (b > a && b > c) {
                max = b;
                win = "B";
            }
            else if (c > a && c > b) {
                max = c;
                win = "C";
            }

            System.out.println(max);
            System.out.println(total);

            double percent = (double)max/total;
            if (percent > 0.5) {
                System.out.println(win);
            }else{
                System.out.println("NOTA");
            }

        }sc.close();
    }
}
