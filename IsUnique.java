import java.util.Arrays;

public class IsUnique {
	
	boolean isUniqueString(String str){
		// without any additional data structure
		
		// we can do brute force with two for loops and check if the two string matches
		// this method give us O(n^2)
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j < str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					return false;
				}	
			}
		}
		return true;
	}
	// the second method we can use is based on ASCII values 
	// the time complexity of this algorithm is O(n log n)
	
	boolean isUniqueChar(String str){
		// first we convert it to charArray
		char[] myStr = str.toCharArray();
		// then we sort it 
		Arrays.sort(myStr);
		
		// now we run for loop to check if the characters are unique
		
		for(int i = 0; i < myStr.length -1; i ++)
		{
			if (myStr[i] != myStr[i + 1]){// here we check if two character in arrays dont mathc
				continue;
			}else{
				return false;
			}
			
		}
		return true;
		
		
	}

}
