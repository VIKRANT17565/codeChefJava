import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            if (n%4 == 0) {
                System.out.println("Good");
            }
            else{
                System.out.println("Not Good");
            }
        }
        sc.close();
    }
}
