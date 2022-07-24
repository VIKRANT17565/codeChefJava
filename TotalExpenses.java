import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int q = sc.nextInt();
            int p = sc.nextInt();
            double total = q*p;

            if (q > 1000) {
                total = total - (0.1*total);
            }
            
            System.out.println(total+"00000");
        }
        sc.close();
    }
}
