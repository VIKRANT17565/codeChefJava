import java.util.Scanner;

public class FourEquidistantPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if (d%2 == 1) {
            System.out.println(-1);
        }
        else{
            System.out.println(0+" "+(d/2));
            System.out.println((d/2)+" "+0);
            System.out.println(0+" "+(-d/2));
            System.out.println((-d/2)+" "+0);
        }
        sc.close();
    }
}
