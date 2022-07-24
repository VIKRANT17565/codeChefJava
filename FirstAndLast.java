import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;             //sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = 4;          //sc.nextInt();
            long arr[] = {1, 2, 2000000000, 1000000000};    //new long[n];
            // for (int i = 0; i < n; i++) {
            //     arr[i]= sc.nextLong();
            // }

            long max = arr[0]+arr[n-1];
            // System.out.println(max);
            for (int i = n-1; i >= 1; i--) {
                long n1 = arr[i];
                long n2 = arr[i-1];        //[(i+n-1)%(n)];
                // System.out.println(i+" "+(i-1));
                // System.out.println(n1+" "+n2);
                long chg = n1+n2;
                if (max < chg) {
                    max = chg;
                }
                // System.out.println(max+"  @@ "+chg);
            }
            
            System.out.println(max);

        }
        sc.close();
    }
}
