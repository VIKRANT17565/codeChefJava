import java.util.Scanner;

public class CovidAndTheatreTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n%2 == 0 && m%2== 0) {
                int x = (n*m)/4;
                System.out.println(x);
            }
            else if(n%2 != 0 && m%2== 0){
                int x = ((n+1)*m)/4;
                System.out.println(x);
            }
            else if(n%2 == 0 && m%2 != 0){
                int x = ((n)*(m+1))/4;
                System.out.println(x);
            }
            else{
                int x = ((n+1)*(m+1))/4;
                System.out.println(x);
            }

            

        }
        sc.close();
    }
}
