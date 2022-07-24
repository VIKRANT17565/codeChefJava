import java.util.Scanner;

public class ChefAndNextGen{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t < tc; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int powerRequired = a*b;
            int powerOnMoon   = x*y;
            if (powerRequired > powerOnMoon) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}