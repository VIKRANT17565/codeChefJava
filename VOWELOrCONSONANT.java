import java.util.Scanner;

public class VOWELOrCONSONANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        boolean isVowel = false;
        
        char vowels[] = {'A', 'E', 'I', 'O', 'U'};
        for (char d : vowels) {
            if (c.charAt(0) == d) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

        sc.close();
    }
}
