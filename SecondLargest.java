import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int secondSmall;
            if ((a < b && a > c) || (a > b && a < c)) {
                secondSmall = a;                
            }
            else if((b < a && b > c)||(b > a && b < c)) {
                secondSmall = b;
            }
            else{
                secondSmall = c;
            }
            System.out.println(secondSmall);
        }
        sc.close();
    }
}
