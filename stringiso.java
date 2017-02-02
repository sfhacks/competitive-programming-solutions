import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class StringIsomorphism {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		String a = in.nextLine();
		String b = in.nextLine();
		
		if (a.length() != b.length()){
			System.out.print("NO");
			return;
		}
		
		boolean fail = false;
		for (int i = 0; i < a.length(); i++){
			char c = a.charAt(i);
			char d = b.charAt(i);
			
			if (map.containsKey(c)){
				if (map.get(c) != d){
					fail = true;
				}
			} else {
				map.put(c, d);
			}
		}
		System.out.print(fail ? "NO" : "YES");
	}
}
