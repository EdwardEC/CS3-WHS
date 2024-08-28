import java.util.*;
import java.io.*;

public class Arusha {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("arusha.dat"));
        int x = scan.nextInt();
        scan.nextLine();
        while(x-- > 0){
            String str = scan.nextLine();
            for(int i = 0; i < str.length(); i++){
                if(str.substring(i, i + 1).equals(" "))
                    System.out.println(arusha(str.substring(0, i), str.substring(i + 1, str.length())));
            }
        }
        scan.close();
    }

    public static String arusha(String str, String x){
        char[] arr = str.toCharArray();
        for(int i = 0; i < x.length(); i++){
            if(x.substring(i, i + 1).equals("L")){
                char temp = arr[0];
                for(int j = 0; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
            if(x.substring(i, i + 1).equals("R")){
                char temp = arr[arr.length - 1];
                for(int j = arr.length - 1; j > 0; j--){
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        return new String(arr);
    }
}
