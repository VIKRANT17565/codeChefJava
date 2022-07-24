import java.util.Scanner;

public class EnormousInputTest {
    public static void main(String args[]){
        int n, k, d = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();            
            if (t[i] % k == 0){
                d++;
            }
        }
        System.out.println(d);
        sc.close();
    }
}
