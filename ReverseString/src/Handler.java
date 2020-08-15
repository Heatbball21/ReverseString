import java.util.ArrayList;

public class Handler {

	
	ArrayList<Character> rev = new ArrayList<Character>();
	char[] arr;
	
	
	public String reverse(String str) {
		
		arr = str.toCharArray();
		
		for(int j = arr.length -1; j >= 0; j--) {
			rev.add(arr[j]);
		}
		
		
		return rev.toString();
	}
	
	
}
