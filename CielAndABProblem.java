import java.util.Scanner;

public class CielAndABProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a-b;

        int r = c%10;

        if (r < 9) {
            c++;
        }else{
            c--;
        }

        System.out.println(c);

        sc.close();
    }
}
