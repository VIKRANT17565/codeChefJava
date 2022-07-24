import java.util.Scanner;

public class BinaryBaseBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            int count = 0;

            for (int i = 0; i < n/2; i++) {
                // System.out.println(s.charAt(i)+" "+s.charAt(n-1-i));
                if (s.charAt(i) != s.charAt(n-1-i)) {
                    count++;
                }
            }

            if (k >= count) {
                if (n%2 == 0) {
                    if ((k-count)%2 == 0) {
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                else{
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("NO");
            }
            

        }
        sc.close();
    }
}
