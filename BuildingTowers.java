import java.util.Scanner;

public class BuildingTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            long x = sc.nextLong();
            long m = sc.nextLong();
            long height = 0;
            long inventory = 1;
            long count = 0;
            while (height < x) {
                height += inventory;
                inventory -= inventory;
                inventory += height;

                count++;
            }
            
            if (count > m) {
                System.out.println(0);
            }
            else{
                System.out.println(m - count + 1);
            }
        }
        sc.close();
    }
}
