import java.util.Scanner;

public class ChefAndDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count1++;
                }
                else{
                    count2++;
                }
            }

            if(count2 == 1 || count1 == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        sc.close();
    }
}
