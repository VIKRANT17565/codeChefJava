import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            long a[] = new long[n];

            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }

            long small = a[0];
            //int next = 0;
            long cost = 0;

            int j = 1;
            while (j != n) {
                if (small > a[j]){
                    small = a[j];
                }
                j++;
            }
            
            cost = small*(n-1);

            System.out.println(cost);
            

        }
        sc.close();
    }
}
