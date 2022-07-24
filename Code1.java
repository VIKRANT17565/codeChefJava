import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    n1++;
                }
                else if (a[i] == 2) {
                    n2++;
                }
                else{
                    n3++;
                }
            }
            
            int sn = (int)((double)n1*(2*(n3+n2) + (n1 - 1))/2);
            sn += ((n2-1)*n2)/2;
            System.out.println(sn);

        }
        sc.close();
    }
}
