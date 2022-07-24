import java.util.Scanner;

public class DevendraAndWaterSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int remain = z-y-(a+b+c);

            if (remain >= 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
        sc.close();
    }
}
