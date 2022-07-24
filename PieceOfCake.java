import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int count[] = new int[256];
            //int max = 0;
            
            for (int j = 0; j < s.length(); j++) {
                count[s.charAt(j)] += 1;
            }           

            
        }
        sc.close();
    }
}
