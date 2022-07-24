import java.util.Scanner;

// check solution
public class TransformTheExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            String exp = sc.next();
            System.out.println(exp);
        }
        sc.close();
    }
}
