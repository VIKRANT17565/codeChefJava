import java.util.Scanner;

public class SplitTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int a[]= new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = (int)s.charAt(i) - 48;
            }

            int ones = 0;
            int zero = 0;
            // int remain = 0;
            int diff = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    ones++;
                }
                else{
                    zero++;
                }
            }

            // remain = (ones < zero) ? 0 : 1;
            diff = Math.abs(ones - zero);

            if(diff == 0){
                System.out.println(0);
            }
            else if (diff < k) {
                System.out.println(1);
            }
            else{
                int x = diff/k;
                if (diff%2 == 1) {
                    x++;                    
                }
                
                System.out.println(x);
            }

        }
        sc.close();
    }
}
