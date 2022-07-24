import java.util.Scanner;

public class FavouriteStringChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            for (int j = 0; j < n-3; j++) {
                if (s.charAt(j) == 'c' && s.charAt(j+1) == 'o' && s.charAt(j+2) == 'd' && s.charAt(j+3) == 'e') {
                    System.out.println("AC");
                    break;                    
                }
                else if (s.charAt(j) == 'c' && s.charAt(j+1) == 'h' && s.charAt(j+2) == 'e' && s.charAt(j+3) == 'f'){
                    System.out.println("WA");
                    break;
                }
            }

        }
        sc.close();
    }
}
