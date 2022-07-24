import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
                System.out.println("YES");                
            }
            else{
                System.out.println("NO");
            }
            
        }
        sc.close();
    }
}
