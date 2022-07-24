import java.util.Scanner;

public class ChefAndMutableStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String r = "";

        if (s.length() == t.length()) {
            r = checkMatch(s, t);
            System.out.println(r);         
        }else{
            System.out.println("No");
        }

        

        sc.close();

    }

    private static String checkMatch(String s, String t) {
        String vowel = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.substring(i, i+1)) && !vowel.contains(t.substring(i, i+1))) {
                return "No";
            }
        }

        return "Yes";
    }
}
