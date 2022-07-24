import java.util.Scanner;

// codeChef Q-code : CNTPEAK

public class CountNumberOfPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            
            int res = 10*(n-2)*((int)Math.pow(3, n-3));

            System.out.println(res);
        }
        sc.close();
    }
}
