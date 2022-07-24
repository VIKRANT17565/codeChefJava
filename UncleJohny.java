import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int i = 0; i < t;i++){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int j = 0; j <n ; j++){
                a[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            int target = a[k-1];
            // System.out.println(target);
            Arrays.sort(a);
            for (int j = 0; j <n ; j++) {
                // System.out.println(a[j]);
                if(target == a[j]){
                    System.out.println(j+1);
                    break;
                }
            }
        }
        sc.close();
    }
}