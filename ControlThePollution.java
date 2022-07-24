import java.util.Scanner;

public class ControlThePollution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int temp = n;

            int b = 0;
            int c = 0;
            int cb[] = new int[2];
            
            if ((double)n/100 > n/100) {
                b = (n/100)+1;
            }else{
                b = n/100;
            }
            if ((double)n/4 > n/4) {
                c = (n/4)+1;
            }else{
                c = n/4;
            }

            int i = 0;
            // while (i < n) {
            //     i += 100;
            //     b++;
            // }
            // i = 0;
            // while (i < n) {
            //     i += 4;
            //     c++;
            // }
            // i = 0;
            while (i < n) {
                if(temp >= 100){
                    i += 100;
                    temp -= 100;
                    cb[1]++;
                }
                else{
                    i += 4;
                    temp -= 4;
                    cb[0]++;
                }
            }


            // System.out.println(cb[0] +" "+ cb[1]);

            int ec = c*y;
            int eb = b*x;
            int ecb = cb[0]*y + cb[1]*x;

            if (ec <= eb && ec <= ecb) {
                System.out.println(ec);
            }
            else if (eb <= ec && eb <= ecb) {
                System.out.println(eb);
            }
            else if(ecb <= ec && ecb <= eb){
                System.out.println(ecb);
            }


        }
        sc.close();
    }
}
