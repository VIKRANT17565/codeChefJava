import java.util.Scanner;

public class DecompositionReaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int tc = sc.nextInt();
        // for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            // System.out.println(n+" "+m);
            long q[] = new long[n];
            for (int i = 0; i < n; i++) {
                q[i] = sc.nextLong()%1000000007;
            }
            // long cx[] = new long[2];
            int cx1 = 0;
            int cx2 = 0;

            // for (int ii : q) {
            //     System.out.print(ii+" ");
            // }System.out.println();
            
            for (int i = 0; i < m; i++) {
                // cx[0] = sc.nextLong()%1000000007;
                // cx[1] = sc.nextLong()%1000000007;
                cx1 = sc.nextInt()%1000000007;
                cx2 = sc.nextInt()%1000000007;
                // System.out.println("cx[0] : "+cx[0]);
                // System.out.println("cx[1] : "+cx[1]);
                
                
                // int equ[] = new int[(int)(2*cx[1])];
                // for (int j = 0; j < 2*cx[1]; j++) {
                //     equ[j] = sc.nextInt();
                // }
                long equ[] = new long[2*cx2];
                for (int j = 0; j < 2*cx2; j++) {
                    equ[j] = sc.nextLong();
                }



                // for (int ii : equ) {
                //     System.out.print(ii+" ");
                // }System.out.println();

                // for (int j = 0; j < 2*cx[1]; j+=2) {
                //     q[equ[j+1]-1] += (q[(int)cx[0]-1]*equ[j])%1000000007;
                //     // System.out.println(q[equ[j+1]-1]);
                // }
                for (int j = 0; j < 2*cx2; j+=2) {
                    q[(int)equ[j+1]-1] += (q[(int)cx1-1]*equ[j])%1000000007;
                    // System.out.println(q[equ[j+1]-1]);
                }




                q[cx1-1] = 0;
                // for (int ii : q) {
                //     System.out.print(ii%1000000007+" ");
                // }
                // System.out.println();
                
            }
            // System.out.print("new quantity : ");
            for (long ii : q) {
                System.out.println(ii%1000000007);
            }
            // System.out.println();

        // }
        sc.close();
    }
}
