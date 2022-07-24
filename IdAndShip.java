import java.util.Scanner;

public class IdAndShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		for (int i = 0; i < t; i++){
            String s = sc.nextLine();
            s = s.toUpperCase();
            int c = s.charAt(0);

            if (c == 66) {
                System.out.println("BattleShip");
            }
            if (c == 67) {
                System.out.println("Cruiser");
            }
            if (c == 68) {
                System.out.println("Destroyer");
            }
            if (c == 70) {
                System.out.println("Frigate");
            }
        }
        sc.close();
    }
}
