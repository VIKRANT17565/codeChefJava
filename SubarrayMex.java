// import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int c = 0;
            if (x > k) {
                System.out.println(-1);
            }else if (n == k && k == x) {
                for (int i = 0; i < k; i++) {
                    System.out.print(i+" ");
                }System.out.println();
            }
            else{
                c = 0;
                for (int i = 0; i < n; i++) {
                    if(c == x){
                        c = 0;
                    }
                    System.out.print(c+" ");
                    c++;
                }System.out.println();






                // int temp = x-1;
                // int arr[] = new int[n];
                // ArrayList<Integer> track = new ArrayList<>();
                // for (int i = 0; i < x; i++) {
                //     arr[i] = temp;
                //     temp--;
                // }

                // // for (int i : arr) {
                // //     System.out.println(i);
                // // }

                // for (int i = 1; i <= (n-k); i++) {
                //     for (int j = i; j < k+i; j++) {
                //         track.add(arr[j]);    
                //     }
                //     int sum  = x*(x-1)/2;
                //     int tsum = 0;
                //     for (int j = 0; j < k; j++) {
                //         tsum += track.get(j);
                //     }
                //     for (int j = 0; j < k; j++) {
                //         track.remove(0);
                //     }
                //     // System.out.println("index : "+ (i+2));
                //     // System.out.println(sum +" "+ tsum);
                //     arr[i+x-1] = sum - tsum;
                // }
                // for (int i = 0; i < arr.length; i++) {
                //     System.out.print(arr[i]+" ");
                // }System.out.println();
            }
        }
        sc.close();
    }
}
