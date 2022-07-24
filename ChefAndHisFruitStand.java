import java.util.Scanner;

public class ChefAndHisFruitStand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int noOfFruitChaat = x/2 < y ? x/2:y;

            System.out.println(noOfFruitChaat);
        }
        sc.close();
                
    }
}
