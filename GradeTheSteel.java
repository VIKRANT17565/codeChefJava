import java.util.Scanner;

public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int hardness = sc.nextInt();
            double cContent = sc.nextDouble();
            int tensile  = sc.nextInt();

            if (hardness > 50 && cContent < 0.7 && tensile > 5600) {
                System.out.println(10);
            }
            else if (hardness > 50 && cContent < 0.7 && tensile <= 5600) {
                System.out.println(9);
            }
            else if (hardness <= 50 && cContent < 0.7 && tensile > 5600) {
                System.out.println(8);
            }
            else if (hardness > 50 && cContent >= 0.7 && tensile > 5600) {
                System.out.println(7);
            }
            else if (hardness > 50 || cContent < 0.7 || tensile > 5600) {
                System.out.println(6);
            }
            else{
                System.out.println(5);
            }


        }
        sc.close();
    }
}
