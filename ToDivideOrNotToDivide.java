import java.util.Scanner;

public class ToDivideOrNotToDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            
            int num = solve(a,b,n);
            System.out.println(num);

        }
        sc.close();
    }

    private static int solve(int a, int b, int n) {
        if(a == b){
            return -1;
        }


        if (a%b  == 0 || b%a == 0) {
            return -1;
        }

        int i = n/a;
        while (true) {
            int x = a*i;
        
            // System.out.println(x);
            if (x >= n && x%b != 0) {
                return x;
            }
            i++;
            if (i == 100) {
                // System.out.println("Failed");
                return -1;
            }
        }
    }
}
