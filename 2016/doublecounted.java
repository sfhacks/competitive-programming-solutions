import java.util.*;
import java.io.*;

public class DoubleCounted {
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < N; i++) {
			int val = in.nextInt();
			if (set.contains(val)) {
				System.out.print(val);
				return;
			}
			set.add(val);
		}
		
		System.out.print("NONE");
	}
}
