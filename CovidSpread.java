import java.util.Scanner;

public class CovidSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int d = sc.nextInt();

            int infectedPeople = 1;

            int j = 0;
            while (j != d) {
                if (j < 10) {
                    infectedPeople *= 2;
                }
                else{
                    infectedPeople *= 3;
                }

                if (infectedPeople >= n) {
                    infectedPeople = n;
                    j = d-1;
                }
                j++;
            }

            System.out.println(infectedPeople);


        }
        sc.close();
    }
}
