import java.util.Scanner;

public class TCSExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int dsa_d = sc.nextInt();
            int toc_d = sc.nextInt();
            int dm_d = sc.nextInt();

            int dsa_s = sc.nextInt();
            int toc_s = sc.nextInt();
            int dm_s = sc.nextInt();

            int d_win = winner(dsa_d, toc_d, dm_d, dsa_s, toc_s, dm_s);

            if (d_win == 1) {
                System.out.println("DRAGON");
            }
            else if (d_win == 0) {
                System.out.println("SLOTH");
            }
            else{
                System.out.println("TIE");
            }
            
            
        }
        sc.close();
    }

    private static int winner(int dsa_d, int toc_d, int dm_d, int dsa_s, int toc_s, int dm_s) {
        int total_d = dsa_d+toc_d+dm_d;
        int total_s = dsa_s+toc_s+dm_s;
        if (total_d > total_s) {
            return 1;
        }
        else if(total_d < total_s){
            return 0;
        }
        else{
            if (dsa_d > dsa_s) {
                return 1;
            }
            else if (dsa_d < dsa_s){
                return 0;
            }
            else{
                if (toc_d > toc_s){
                    return 1;
                }
                else if (toc_d < toc_s){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        }
        
    }
}
