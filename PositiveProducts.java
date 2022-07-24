import java.util.Scanner;

public class PositiveProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long countPos = 0;
            long countNeg = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
                if(arr[i] > 0){
                    countPos++;
                }
                if(arr[i] < 0){
                    countNeg++;
                }
            }

            long ans = (countPos*(countPos-1)/2) + (countNeg*(countNeg-1)/2);
            System.out.println(ans);

        }
        sc.close();
    }
}
