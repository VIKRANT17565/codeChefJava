import java.util.Scanner;

public class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String words = sc.nextLine();
            boolean f = canRead(s, words);
            if(f){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }

    private static boolean canRead(String s, String w) {
        for (int i = 0; i < w.length(); i++) {
            if (!s.contains(w.substring(i, i+1))) {
                return false;
            }
        }
        return true;
    }
}
