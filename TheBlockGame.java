import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int p = n;
            int a = n;
            int nReverse = 0;
            int tenth = 1;
            
            while (a != 0){
                a = a/10;
                tenth *= 10;
            }

            while(n != 0){
                tenth /= 10;
                nReverse += (n - (n/10 * 10)) * tenth;
                n = n/10;
            }
            System.out.println("nReverse : "+nReverse);
            if (nReverse == p) {
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
        }
        sc.close();
    }
}
