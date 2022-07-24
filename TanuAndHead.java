import java.util.Scanner;

public class TanuAndHead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            //int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            boolean yes = false;
            boolean no  = false;
            boolean ind = false;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'Y'){
                    yes = true;
                }
                else if(s.charAt(j) == 'N'){
                    no = true;
                }
                else{
                    ind = true;
                }
            }

            if (ind) {
                System.out.println("INDIAN");
            }
            else if (yes) {
                System.out.println("NOT INDIAN");
            }
            else if (no) {
                System.out.println("NOT SURE");
            }

        }
        sc.close();
    }
}
