import java.util.Scanner;

public class GeometricMeanInequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long a[] = new long[n];
            int countN = 0;
            int countP = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] == 1) {
                    countP++;
                }
                else{
                    countN++;
                }
            }


            if (n%2 == 0) {
                if ((n/2)%2 == 0) {
                    if (countN == countP) {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
                else{
                    if (countN == (countP-2) || (countN-2) == countP) {
                        System.out.println("Yes");
                    }
                    else if (countN == countP) {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
            }
            else{
                if (countN == (countP-1) || (countN-1) == countP) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

        }
        sc.close();
    }
}
