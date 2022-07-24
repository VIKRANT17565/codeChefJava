import java.util.ArrayList;
import java.util.Scanner;

public class BitwiseBlend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = false;
        int m = 0;
        int ij[] = new int[2];
        ArrayList<int[]> track = new  ArrayList<>();
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            f = false;
            m = 0;

            for (int i = 0; i < n-1; i++) {
                if ((arr[i]&arr[i+1])%2 == (arr[i]|arr[i+1])%2) {
                    for (int j = i; j < n; j++) {
                        if (((arr[i]^arr[j])&arr[i+1])%2 != ((arr[i]^arr[j])|arr[i+1])%2) {
                            arr[i] = arr[i]^arr[j];
                            m++;
                            ij[0] = i;
                            ij[1] = j;
                            track.add(ij);
                            f = true;
                        }
                    }
                }
            }

            if (f) {
                System.out.println(m);
                for (int i = 0; i < track.size(); i++) {
                    for (int val : track.get(0)) {
                        System.out.print((val+1) +" ");
                    }System.out.println();
                    track.remove(0);
                }
            }
            else{
                System.out.println(-1);
            }

        }
        sc.close();
    }
}
