import java.util.Scanner;

public class ChefAndRemissness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            //minimum
            if (a < b){
                System.out.print(b+" ");
            }else{
                System.out.print(a+" ");
            }

            //maximum
            System.out.println(a+b);

        }
        sc.close();
    }
}
