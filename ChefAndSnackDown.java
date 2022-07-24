import java.util.Scanner;

public class ChefAndSnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int hosted[] = {2010, 2015, 2016, 2017, 2019};
            boolean isHosted = false;
            
            for (int j = 0; j < hosted.length; j++) {
                if (n == hosted[j]) {
                    isHosted = true;
                    break;
                }
            }

            if (isHosted) {
                System.out.println("HOSTED");
            }
            else{
                System.out.println("NOT HOSTED");
            }
            
        }
        sc.close();
    }
}
