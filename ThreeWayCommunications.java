import java.util.Scanner;

public class ThreeWayCommunications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int r = sc.nextInt();
            int c1[] = new int[2];
            int c2[] = new int[2];
            int c3[] = new int[2];
            for (int j = 0; j < 2; j++) {
                c1[j] = sc.nextInt();
            }
            for (int j = 0; j < 2; j++) {
                c2[j] = sc.nextInt();
            }
            for (int j = 0; j < 2; j++) {
                c3[j] = sc.nextInt();
            }

            double c1c2 = Math.sqrt(((c1[0]-c2[0])*(c1[0]-c2[0])) + ((c1[1]-c2[1])*(c1[1]-c2[1])));
            double c2c3 = Math.sqrt(((c2[0]-c3[0])*(c2[0]-c3[0])) + ((c2[1]-c3[1])*(c2[1]-c3[1])));
            double c1c3 = Math.sqrt(((c1[0]-c3[0])*(c1[0]-c3[0])) + ((c1[1]-c3[1])*(c1[1]-c3[1])));

            if ((c1c2 <= r && c2c3 <= r) || (c1c3 <= r && c2c3 <= r) || (c1c2 <= r && c1c3 <= r)) {
                System.out.println("yes");                
            }
            else{
                System.out.println("no");
            }

        }
        sc.close();
    }
}
