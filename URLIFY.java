
/*
 *  Write a method to replace all spaces in a string with '%20: 
 *  You may assume that the string has sufficient space at the end
 *   to hold the additional characters, 
 *   and that you are given the "true" length of the string. 
 *   (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 * 
 */

// First I will consider using string function replace to achieve this 
public class URLIFY {
	
	String changeString(String str, Integer trueLength){
		
		// here we are relacing the empty space with %20
		return str.replace(" ","%20");
	}
	// second option is to user string builder 
	String changeString2(String str, Integer trueLength)
	{
		// first we split the worlds 
		String[] words = str.split(" ");
		// second we build a new string
		StringBuilder sentence = new StringBuilder(words[0]);
		// run a for loop 
		for(int i = 1; i < words.length; i++)
		{
			// here we are adding it back to sentence
			sentence.append("%20");
			sentence.append(words[i]);
		}
		// finally we are returnig a new string 
		return sentence.toString();
	}
	// solutoon from the book where we start from the end and 
	// in first pass we can the string to check how many spaces we have 
	// in the second pass we work in reverse and edit the string 
	// if we see empty space we replace ith with %20 if no empty space we copy the original string
	/*
	 * method takes a string character array and a integer for length 
	 * we inizialize int spaceCount and i to 0
	 * run a for loop to count the number of empty space and initializing index
	 */
	public String repalceSpaces(char[]  str, int trueLength){
		
		if (str == null) {
			return "";
		}
		
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}
		// setting index 
		index = trueLength + spaceCount * 2;
		// checking if trueLength is less then str.length 
		if(trueLength < str.length) str[trueLength] = '\0';
		
		// running a for loop in reverse to replace the empty places with %20
		for(i = trueLength -1; i >= 0; i--){
			if(str[i] == ' '){
				str[index -1] = '0';
				str[index - 2] = '2';
				str[index -3] = '%';
				index = index - 3;
			}else {
				str[index -1] = str[i];
				index--;
			}
		}
		return new String(str).trim();
	}
	
	
}
