import java.util.Scanner;

public class FarmerFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x + y;
            boolean isPrime = false;

            while (!isPrime) {
                int d = 0;
                sum++;                
                for (int j = 2; j < sum; j++) {
                    if (sum%j == 0) {
                        d++;
                    }
                }
                if (d == 0) {
                    isPrime = true;
                }
                else{
                    isPrime = false;
                }
                
            }System.out.println(sum - (x+y));
            
        }
        sc.close();
    }
}
