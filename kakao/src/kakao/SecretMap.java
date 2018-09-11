package kakao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretMap {
	static String run() throws IOException {
		Scanner s = new Scanner(System.in);	
		int n = Integer.parseInt(s.nextLine());
		Integer[] map1 = stringToList(s.nextLine());
		Integer[] map2 = stringToList(s.nextLine());
		s.close();
		
		int[] finalMap = new int[n];
		for(int i = 0; i < n; i++) {
			finalMap[i] = map1[i].intValue() | map2[i].intValue();
		}
		
		String result = "[";
		for (int e : finalMap) {
			result += "\"";
			String tmp = "";
			for(int i = 0; i < n; i++) {
				if (e % 2 == 1) tmp += "#";
				else tmp += " ";
				e = e / 2;
			}
			result += new StringBuilder(tmp).reverse().toString();
			result += "\"";
		}
		result += "]";
		
		return result.replaceAll("\"\"", "\", \"");
	}
	
	static Integer[] stringToList(String str) {
		List<Integer> result = new ArrayList<Integer>();
		str = str.replaceAll("[\\[|\\]]", "");
		for(String e: str.split(", ")) {
			result.add(Integer.parseInt(e));
		}
		
		Integer[] tmp = new Integer[result.size()];
		return result.toArray(tmp);
	}
}
