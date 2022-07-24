import java.util.Scanner;

public class GameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int n = a;
            int s = b;

            if (n < s){
                n += c;
            }
            else{
                s += c;
            }

            if (n < s){
                n += d;
            }
            else{
                s += d;
            }

            if (n < s){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }

        }
        sc.close();
    }
}
