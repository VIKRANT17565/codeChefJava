import java.util.Scanner;

public class ChefAndTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int min = 0, max = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(j) && s1.charAt(j) == '?') {
                    max++;
                }
                else if ((s1.charAt(j) == '?' && s2.charAt(j) != '?') || (s1.charAt(j) != '?' && s2.charAt(j) == '?')) {
                    max++;
                }
                else if(s1.charAt(j) != s2.charAt(j) && s1.charAt(j) != '?' && s2.charAt(j) != '?'){
                    min++;
                    max++;
                }
            }

            System.out.println(min + " " + max);
            
        }
        sc.close();
    }
}
