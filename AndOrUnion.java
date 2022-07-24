import java.util.Scanner;

//TLE error

public class AndOrUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long x = 0;
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            long a[] = new long[n];
            //int b[] = new int[n*(n-1)/2];


            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLong();
            }

            //for (int j = 0; j < n-1; j++) {
            int j = 0;
            while(j < n-1){
                for (int k = j+1; k < n; k++) {
                    x |= a[j]&a[k];
                }
                j++;
            }
            System.out.println(x);
            x = 0;
        }
        sc.close();
    }
}
