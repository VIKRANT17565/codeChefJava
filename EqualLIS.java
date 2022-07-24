import java.util.Scanner;

public class EqualLIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            // ArrayList<Integer> arr = new ArrayList<>();
            // for (int j = 0; j < n; j++) {
            //     arr.add(n+1);
            // }

            if (n%2 != 0) {                     //odd
                System.out.println("YES");
                for (int j = 1; j <= n/2; j++) {
                    System.out.print(j + " ");
                }
                System.out.print(n+" ");
                for (int j = n-1; j > n/2; j--) {
                    System.out.print(j + " ");
                }System.out.println();
            }
            else if(n != 2){
                System.out.println("YES");
                System.out.print(n/2 + " ");
                for (int j = 1; j < n/2; j++) {
                    System.out.print(j + " ");
                }
                for (int j = n; j > n/2; j--) {
                    System.out.print(j+" ");
                }System.out.println();
            }
            else{
                System.out.println("NO");
            }


        }
        sc.close();
    }
}
