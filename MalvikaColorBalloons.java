import java.util.Scanner;

public class MalvikaColorBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String s = sc.nextLine();
            int a = 0, b = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    a++;
                }else{
                    b++;
                }
            }

            if (a < b) {
                System.out.println(a);
            }else{
                System.out.println(b);
            }

        }
        sc.close();
    }
}
