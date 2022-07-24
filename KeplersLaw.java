import java.util.Scanner;

public class KeplersLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            if ((Math.pow(t1, 2))/(Math.pow(r1, 3)) == (Math.pow(t2, 2))/(Math.pow(r2, 3))) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            

        }
        sc.close();
    }
}
