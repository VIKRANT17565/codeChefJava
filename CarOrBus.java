import java.util.Scanner;

public class CarOrBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int x = sc.nextInt();       //Car
            int y = sc.nextInt();       //Bike

            if(x > y){
                System.out.println("CAR");
            }
            else if (y > x) {
                System.out.println("BIKE");
            }
            else{
                System.out.println("SAME");
            }

        }
        sc.close();
    }
}
