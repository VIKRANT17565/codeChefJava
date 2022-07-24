import java.util.Scanner;

public class WorldChessChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            String s = sc.next();
            int cCount = 0, nCount = 0;
            for (int i = 0; i < 14; i++) {
                if (s.charAt(i) == 'C') {
                    cCount++;
                }
                if (s.charAt(i) == 'N') {
                    nCount++;
                }
            }

            if (cCount > nCount) {
                System.out.println(60*x);
            }
            else if (cCount < nCount) {
                System.out.println(40*x);
            }
            else{
                System.out.println(55*x);
            }

        }
        sc.close();
    }
}
