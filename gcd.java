import java.util.*;
import java.math.*;

public class gcd
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which method would you like to use\n1: BigInteger gcd\n2: No Biginteger or recursion\n3: recursion\n4: No division or modulo");
		String ans = scan.nextLine();
		if (ans.equals("1"))
			System.out.println("Greatest Common Divisor: " + bigint());
		if (ans.equals("2"))
			System.out.println("Greatest Common Divisor: " + nobig());
		if (ans.equals("3")){
			System.out.println("Enter Numbers");
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println("Greatest Common Divisor: " + rec(x, y));
		}
		if (ans.equals("4"))
			System.out.println("Greatest Common Divisor: " + minus());
		scan.close();
	}

	/*---------------------------------------------------------------------
	BigInteger gcd method*/
	public static BigInteger bigint(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		BigInteger a = BigInteger.valueOf(x);
        BigInteger b = BigInteger.valueOf(y);
		return a.gcd(b); 
	}

	/*---------------------------------------------------------------------
	No Biginteger or recursion*/
	public static int nobig(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = x;
		scan.close();
	    if(x > y){
	        for(int i = 1; i <= x; i++){
	            if(x % i == 0 && y % i == 0){
	                z = i;
	            }
	        }
	    }
	    else if(x < y){
	        for(int i = 1; i <= y; i++){
	            if(x % i == 0 && y % i == 0){
	                z = i;
	            }
	        }
	    }
	    return z; 
	}

	/*---------------------------------------------------------------------
	using recursion
	I couldn't figure it out and did some research and found about the euclidean algorithm*/
	public static int rec(int x, int y){
	    if(y == 0){
	        return x;
	    }
	    else {
	        return rec(y, x % y);
	    }
	}

	/*---------------------------------------------------------------------
	not using division or modulo*/
	public static int minus(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		while(x != y){
			if(x > y)
				x -= y;
			else
				y -= x;
		}
		return x;
	}
}