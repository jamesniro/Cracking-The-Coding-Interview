import java.util.Arrays;

public class CheckPermutation {
	// we can achieve this by turning both strings in chararray
	// then sorting it
	// after that we can check if two strings are equal 
	// time complexity is O(nlogn)
	boolean checkPerm(String str, String str2)
	{
		// first we check if two strings have the same length
		if(str.length() != str2.length()){
			return false;
		}
		char[] charArrayOne = str.toCharArray();
		char[] charArrayTwo = str.toCharArray();
		
		Arrays.sort(charArrayOne);
		Arrays.sort(charArrayTwo);
		// calling build in equals function to check if two strings are equal
		return Arrays.equals(charArrayOne, charArrayTwo);
	}
}
