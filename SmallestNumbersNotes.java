import java.util.Scanner;

public class SmallestNumbersNotes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int notes[] = {100, 50, 10, 5, 2, 1};
            int noOfNote = 0;

            for (int j = 0; j < notes.length; j++) {
                noOfNote += n/notes[j];
                n = n%notes[j];
                if (n == 0) {
                    break;
                }
            }
            System.out.println(noOfNote);

        }
        sc.close();
    }
}