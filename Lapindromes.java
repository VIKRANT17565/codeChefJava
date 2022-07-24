import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String s = sc.nextLine();
            int n = s.length()/2;
            
            int fcount = 0, bcount = 0;

            for (int j = 0; j < n; j++) {
                fcount += s.charAt(j);
            }

            for (int j = s.length()-1; j > n; j--) {
                bcount += s.charAt(j);
            }
            if (s.length()%2 == 0) {
                bcount += s.charAt(n);
            }

            if (fcount == bcount) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
