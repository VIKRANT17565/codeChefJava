import java.util.Scanner;

public class ParallelProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int minTime = 0;
            int p1 = 0, p2 = 0;
            // int p1 = a[0];
            // int p2 = a[n-1];

            // Arrays.sort(a);
            // int i = 1;
            // int j = n-2;
            int i = 0;
            int j = n-1;
            while (i <= j) {
                if (p1 < p2) {
                    p1 += a[i];
                    i++;
                }
                else if(p1 > p2){
                    p2 += a[j];
                    j--;
                }
                else{
                    p1 += a[i];
                    p2 += a[j];
                    j--;
                    i++;
                }
                System.out.println("pv : "+p1+" "+p2);
                System.out.println("ij : "+i+" "+j);
            }
            
            minTime = (p1 > p2) ? p1:p2;

            System.out.println("out : "+ minTime);
        }
        sc.close();
    }
}
