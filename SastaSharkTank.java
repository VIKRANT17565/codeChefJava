import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            double af = (double)a/10;
            double bf = (double)b/20;

            if (af > bf) {
                System.out.println("FIRST");
            }
            else if (af < bf) {
                System.out.println("SECOND");
            }
            else{
                System.out.println("ANY");
            }
            
        }
        sc.close();
    }
}
