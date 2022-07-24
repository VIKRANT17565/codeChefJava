import java.util.Scanner;

public class SimpleXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;         //sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long l = 1;     //sc.nextLong();
            long r = 7;     //sc.nextLong();

            long a = l;
            long b = r;
            long c = l+1;
            long d = -1;

            long x1 = a^b;
            // long i = l+1;
            while (c < r) {
                long x2 = x1^c;
                if (x2 != a || x2 != b) {
                    d = x2;
                    if(d > l && d < r){
                        break;
                    }
                    else{
                        d = 0;
                    }
                }
                c++;
            }
            if (c >= r) {
                System.out.println(-1);
            }
            else{
                System.out.println(a+" "+b+" "+c+" "+d);
            }
        }
        sc.close();
    }
}
