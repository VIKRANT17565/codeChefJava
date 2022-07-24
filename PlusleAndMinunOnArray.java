import java.util.ArrayList;
import java.util.Scanner;

public class PlusleAndMinunOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        for (int t = 0; t < tc; t++) {
            arr.clear();
            int n = sc.nextInt();
            long minEve = 1000000000;
            long maxOdd = 0;
            long sumOfEle = 0;
            // long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                long ele = sc.nextLong();
                // a[i] = Math.abs(ele);
                arr.add(Math.abs(ele));
                // if (i%2 == 0) {
                //     if (minEve > a[i]) {
                //         minEve = a[i];
                //     }
                // }
                // else{
                //     if (maxOdd < a[i]) {
                //         maxOdd = a[i];
                //     }
                // }
                if (i%2 == 0) {
                    if (minEve > arr.get(i)) {
                        minEve = arr.get(i);
                    }
                }
                else{
                    if (maxOdd < arr.get(i)) {
                        maxOdd = arr.get(i);
                    }
                }
            }

            long alternatingSum = 0;
            for (int i = 0; i < n; i++) {
                if (i%2 == 0) {
                    alternatingSum += arr.get(i);// a[i];
                }
                else{
                    alternatingSum -= arr.get(i);// a[i];
                }
            }

            // System.out.println(minEve +" "+ maxOdd);

            sumOfEle = alternatingSum;

            alternatingSum -= 2*minEve;
            alternatingSum += 2*maxOdd;

            // System.out.println(alternatingSum);

            // alternatingSum -= minEve;
            // alternatingSum += maxOdd;

            long finalAns = sumOfEle > alternatingSum ? sumOfEle : alternatingSum;
            System.out.println(finalAns);
            
        }
        sc.close();
    }
}
