import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;         //sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long l = 1;     //sc.nextLong();
            long r = 100;     //sc.nextLong();

            // long arr[] = new long[4];

            long a = l;     //-1;
            long b = a+1;
            long c = r;
            long d = r;

            long x = 0;
            while(b < r){
                x = a^b;
                if (x < l) {
                    break;
                }
                b++;
            }

            while (c > l) {
                d = x^c;
                if (d > r) {
                    break;
                }
                c--;
            }

            System.out.println(a+" "+b+" "+c+" "+d);

            if (b == l || c == l || d == l) {
                System.out.println(-1);
            }
            else{
                System.out.println(a+" "+b+" "+c+" "+d);
            }
            
        }
        sc.close();
    }
}
