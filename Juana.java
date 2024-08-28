import java.util.*;
import java.io.*;

public class Juana {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("juana.dat"));
        int x = scan.nextInt();
        for(int t = 1; t <= x; t++) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            int [][] arr = new int[row][col];
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    int n = scan.nextInt();
                    arr[i][j] = n;
                }
            }
            int r = scan.nextInt();
            int c = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(b < row && a < col){
                int [][] arr2 = new int[b][a];
                for(int i = 0; i < b; i++) {
                    for(int j = 0; j < a; j++) {
                        arr2[i][j] = arr[r - 1 + i][c - 1 + j];
                    }
                }
                System.out.println("Test case #" + t + ":");
                for(int i = 0; i < arr2.length; i++) {
                    for(int j = 0; j < arr2[0].length; j++) {
                        System.out.print(arr2[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("--------------------");
            }
            else {
                System.out.println("Test case #" + t + ": Unable to extract requested size!\n--------------------");
            }
        }
        scan.close();
    }
}
