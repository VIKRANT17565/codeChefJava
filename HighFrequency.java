import java.util.Scanner;

public class HighFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n  = sc.nextInt();
            int a[]= new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int track[]= new int[n];
            for (int i = 0; i < n; i++) {
                track[a[i]-1]++;
            }

            int maxfrq = 0;
            int maxfrqInd = 0;
            for (int i = 0; i < n; i++) {
                if (track[i] > maxfrq) {
                    maxfrq = track[i];
                    maxfrqInd = i;
                }
            }

            track[maxfrqInd] = (track[maxfrqInd] %2 == 0)? track[maxfrqInd]/2 : (track[maxfrqInd]/2)+1;

            maxfrq = 0;
            for (int i = 0; i < n; i++) {
                if (track[i] > maxfrq) {
                    maxfrq = track[i];
                }
            }

            System.out.println(maxfrq);

        }
        sc.close();
    }
}
