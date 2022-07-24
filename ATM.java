import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        int x;
        double y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextDouble();

        if (x%5 == 0 && x+0.5 <= y){
            y = y- x- 0.50;
        }
        System.out.println(String.format("%.2f",y));
        sc.close();
    }
}