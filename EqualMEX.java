import java.util.Scanner;

public class EqualMEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int arr[] = new int[2*n];
            int track[] = new int[n+1];
            for (int i = 0; i < 2*n; i++) {
                arr[i] = sc.nextInt();
                track[arr[i]]++;
            }

            // for (int i : track) {
            //     System.out.print(i+" ");
            // }System.out.println();

            String res = EqMEX(track);

            System.out.println(res);

        }
        sc.close();
    }

    private static String EqMEX(int[] track) {
        for (int i = 0; i < track.length; i++) {
            if (track[i] == 0) {
                return "YES";
            }
            if (track[i] == 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
