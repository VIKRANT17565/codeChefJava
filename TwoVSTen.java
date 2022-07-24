import java.util.Scanner;

public class TwoVSTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int count = 0;

            if (n%5 == 0) {
                while (n%10 != 0) {
                    n *= 2;
                    count++;
                }
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }

        }
        sc.close();
    }
}
