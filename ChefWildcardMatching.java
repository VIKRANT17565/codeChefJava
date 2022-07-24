import java.util.Scanner;

public class ChefWildcardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String x = sc.nextLine();
            String y = sc.nextLine();
            boolean isMatch = true;

            for (int j = 0; j < x.length(); j++) {
                if ((x.charAt(j) != y.charAt(j)) && x.charAt(j) != '?' && y.charAt(j) != '?') {
                    isMatch = false;
                }
                /*
                else if (x.charAt(j) == '?' || y.charAt(j) != '?') {
                    isMatch = false;
                }
                else if (x.charAt(j) != '?' || y.charAt(j) == '?') {
                    isMatch = false;
                }
                */
            }

            if (isMatch) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}
