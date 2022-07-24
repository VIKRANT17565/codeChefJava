import java.util.Scanner;

public class ForgottenLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String[] words = sc.nextLine().split(" ");

            String phrases = "";
            for (int j = 0; j < k; j++) {
                phrases += sc.nextLine() + " ";
            }

            for (int j = 0; j < n; j++) {
                if (phrases.contains(words[j])) {
                    System.out.print("Yes ");
                }else{
                    System.out.print("No ");
                }
            }System.out.println();
        }
        sc.close(); 
    }
}
