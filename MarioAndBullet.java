import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int time = y/x;
            int shootTime = 0;
            if (z > time) {
                shootTime = z - time;
            }
            
            System.out.println(shootTime);

        }
        sc.close();
    }
}
