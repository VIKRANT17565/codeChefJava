import java.util.Scanner;

public class AvoidContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();       //total
            int y = sc.nextInt();       //infected
            int z = x-y;                //non-infected
            
            int r = minRoom(y, z);

            System.out.println(r);

        }
        sc.close();
    }

    private static int minRoom(int y, int z) {
        if (z == 0) {
            return y+(y-1);
        }
        return z + 2*y;
    }
}
