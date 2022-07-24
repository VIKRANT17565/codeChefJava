import java.util.Scanner;

public class PairPain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long a[] = new long[n];
            long n1 = 0;
            long n2 = 0;
            long n3 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] == 1) {
                    n1++;
                }
                if (a[i] == 2) {
                    n2++;
                }
                if(a[i] != 1){
                    n3++;
                }
            }
            
            // int sn = ((n2-1)*n2)/2;
            // sn += ((n1*(2*(n3) + (n1 - 1)))/2);
            // System.out.println(sn);

            long sn = n3*n1;
            sn += ((n1-1)*n1)/2 + ((n2-1)*n2)/2;
            System.out.println(sn);

        }
        sc.close();
    }
}
