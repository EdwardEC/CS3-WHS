import java.util.*;
import java.io.*;

public class Ivan {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("ivan.dat"));
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        for(int i = 0; i < n; i++) {
            String ans = scan.nextLine();
            int score = 0;
            double a = 0;
            double c = 0;
            for(int j = 0; j < ans.length(); j++) {
                if(ans.substring(j, j + 1).equals(str.substring(j, j + 1))){
                    score += 6;
                    a++;
                    c++;
                }
                if(!(ans.substring(j, j + 1).equals(str.substring(j, j + 1))) && !(ans.substring(j, j + 1).equals("_"))){
                    score -= 2;
                    a++;
                }
            }
            System.out.printf("Exam #" + (i+1) + ": " + score + " %.1f\n", c/a * 100);
        }
        scan.close();
    }
}
