// import java.util.ArrayList;
import java.util.Scanner;

public class InterestingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            // ArrayList<Integer> a = new ArrayList<>();
            // ArrayList<Integer> s = new ArrayList<>();

            int count = 0;
            while (k%2 == 0) {
                k /= 2;
                count++;
            }
            System.out.print("res : ");
            System.out.println(count);

            // System.out.print("res : ");
            // if (k%2 != 0) {
            //     System.out.println(0);
            // }
            // else{
            //     int j = 1;
            //     double p = 1;
            //     while (p < k) {
            //         p = Math.pow(2, j);
            //         j++;
            //     }j--;

            //     if (p == k) {
            //         System.out.println(j);
            //     }else{
            //         int n = k/2;
            //         int sum = 0;
            //         while (n > 0) {
            //             a.add(n);
            //             sum += n;
            //             s.add(sum);
            //             if (n + sum != k) {
            //                 a.remove(a.indexOf(n));
            //                 s.remove(s.indexOf(sum));
            //                 sum -= n;
            //                 // System.out.println(n);
            //                 // System.out.println(sum);
            //             }
            //             n--;
            //         }
            //         System.out.println(a.size());
            //     }
            // }
        }
        sc.close();
    }
}
