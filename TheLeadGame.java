import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int score1 = 0, score2 = 0;
        int p1Lead = 0, p2Lead = 0;
		for (int i = 0; i < t; i++){
            score1 += sc.nextInt();
            score2 += sc.nextInt();
            if (score1 > score2){
                if (p1Lead < score1 - score2) {
                    p1Lead = score1 - score2;                    
                }
            }
            else if (score1 < score2) {
                if (p2Lead < score2 - score1) {
                    p2Lead = score2 - score1;                    
                }
            }
        }
        if (p1Lead > p2Lead){
            System.out.println(1 +" "+ p1Lead);
        }
        else if (p1Lead < p2Lead){
            System.out.println(2 +" "+ p2Lead);
        }
        sc.close();
    }
}
