package chapterOne;

import java.util.Arrays;

/**
 * 
 * @author James
 *	Implement an algorithm to determin if a string has all the unique character
 *	What if you cant use additional data structure
 *
 */
public class IsUnique {
	// this approach gives us O(n^2)
	
	// this method does not work if the letters are apart from each other for that we need to sort each character
	boolean uniqueString(String str){
		
		
		for(int i = 0; i < str.length() -1; i++)
			if(str.charAt(i) == str.charAt(i+1))
				return false;
		return true;
	}
	// this method works for all type of string because we sort the characters first
	boolean uniqueSString(String str){
		
		
		char[] charArray = str.toCharArray();
		
		Arrays.sort(charArray);
		
		for(int i = 0; i < charArray.length-1; i++)
			if(charArray[i] == charArray[i+1])
				return false;
		return true;
		
		
	}
	
	

}
