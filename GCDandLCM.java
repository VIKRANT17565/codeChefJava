import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = (a > b) ? a:b;
            int min = (a < b) ? a:b;

            long gcd = 0, lcm = 0;

            // finding GCD
            for (int j = min; j > 0; j--) {
                if (min%j == 0) {
                    if (max%j == 0) {
                        gcd = j;
                        break;
                    }
                }
            }

            // finiding LCM
            /*            
            boolean f = true;
            int m = 1;
            while(f){
                int multiplOfMax = max*m;
                if (multiplOfMax%min == 0) {
                    lcm = (multiplOfMax/min)*min;
                    f = false;
                }       
                m++;

            }
            */

            lcm = (long)a*b/gcd;
            System.out.println("GCD LCM : "+gcd+" "+lcm);

        }
        sc.close();
    }
}
