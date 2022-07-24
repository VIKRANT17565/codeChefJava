import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int _i_ = 0; _i_ < t; _i_++) {
            int g = sc.nextInt();
            for (int j = 0; j < g; j++) {
                int i = sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();
                
                if(i == q){
                    System.out.println(n/2);
                }else{
                    if (n%2 != 0) {
                        System.out.println((n/2)+1);
                    }
                    else{
                        System.out.println(n/2);
                    }
                }                
            }
        }
        sc.close();
    }
}
