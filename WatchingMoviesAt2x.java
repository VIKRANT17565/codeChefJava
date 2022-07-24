import java.util.Scanner;

public class WatchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y  =sc.nextInt();

        int totalTime = x - y/2;
        
        System.out.println(totalTime);
        
        sc.close();
    }
}
