import java.util.Scanner;

public class CryingColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n);
            int b1[] = new int[3];
            for (int j = 0; j < 3; j++) {
                b1[j] = sc.nextInt();
            }
            int b2[] = new int[3];
            for (int j = 0; j < 3; j++) {
                b2[j] = sc.nextInt();
            }
            int b3[] = new int[3];
            for (int j = 0; j < 3; j++) {
                b3[j] = sc.nextInt();
            }

            //int upTri = b1[1]+b1[2]+b2[2];
            //int loTri = b2[0]+b3[0]+b3[1];

            int upTri = b1[1]+b1[2]+b3[1];
            int loTri = b1[1]+b3[0]+b3[1];
 

            if (upTri > loTri) {
                System.out.println(upTri);
            }else{
                System.out.println(loTri);
            }


        }
        sc.close();
    }
}
