import java.util.Scanner;

public class Carvans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int maxSpeed[] = new int[n];
            int curSpeed[] = new int[n+1];
            int count = 1;

            for (int i = 0; i < n; i++) {
                maxSpeed[i] = sc.nextInt();    
            }

            curSpeed[0] = maxSpeed[0];

            for (int i = 1; i < n; i++) {
                if (curSpeed[i-1] <= maxSpeed[i]) {
                    curSpeed[i] = curSpeed[i-1];
                }
                else{
                    curSpeed[i] = maxSpeed[i];
                    count++;
                }
            }


            System.out.println(count);

        }
        sc.close();
    }
}
