import java.util.Scanner;

public class PackagingCupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int pack = 0;
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            pack = n;
            int max = 0;
            for (int j = n; j >= 1; j--) {
                if (max < n%j) {
                    max = n%j;
                    pack = j;                    
                }
            }
            System.out.println("pack : "+pack);
        }
        sc.close();
    }
}
