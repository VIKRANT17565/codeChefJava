import java.util.Scanner;

public class IrresponsibleChefAndHisProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n =sc.nextInt();
            int sici[][] = new int[n+1][2];
            sici[0][0] = -1;
            sici[0][1] = -1;

            String r = "NO";
            boolean f = true;

            double si = 0;
            double ci = 0;

            for (int i = 1; i < sici.length; i++) {
                sici[i][0] = sc.nextInt();
                sici[i][1] = sc.nextInt();
                si = sici[i][0];
                ci = sici[i][1];
            }

            f = checkConsist(sici);


            if(f){
                double p = (ci/si)*100;
                if (p < 25) {
                    System.out.println("YES HARD");
                }
                else if (p >= 25 && p < 50) {
                    System.out.println("YES MEDIUM");
                }
                else if (p >= 50 && p < 75) {
                    System.out.println("YES EASY");
                }
                else{
                    System.out.println("YES CAKEWALK");
                }
            }
            else{
                System.out.println(r);
            }


            // for (int i = 0; i < sici.length; i++) {
            //     for (int j = 0; j < sici[i].length; j++) {
            //         System.out.print(sici[i][j]);
            //     }System.out.println();
            // }
        }
        sc.close();
    }

    private static boolean checkConsist(int[][] sici) {
        for (int i = 1; i < sici.length; i++) {
            if (sici[i-1][1] > sici[i][1]) {
                return false;
            }
            if(sici[i-1][0] > sici[i][0]){
                return false;
            }
            if(sici[i][0] < sici[i][1]){
                return false;
            }
            if (sici[i-1][0] == sici[i][0]) {
                if (sici[i-1][1] != sici[i][1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
