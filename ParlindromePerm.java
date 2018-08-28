import java.util.HashMap;

/* 
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
	EXAMPLE
	Input: Tact Coa
	Output: True (permutations:"taco cat'; "atco cta '; etc.)
	t's therefore sufficient to say that, to be a permutation of a palindrome, 
	a string can have no more than one character that is odd.
	palindrome is rearranging of a string 
	Time Complexity of O(n)
 */
	
// this funciton we take the numeric value of each character 
public class ParlindromePerm {
	// starting the function as a boolean function that takes string
	boolean isPermutationOfPalindrome(String str){
		// making a array map with 128 intergers
		int[] map  = new int[128];
		// running a for loop 
		for(int i = 0; i < str.length(); i++){
			// adding the string to the character array
			map[str.charAt(i)]++;
		}
		// setting count to equal zero
		int count  = 0;
		for(int key = 0; key < map.length && count <= 1; key++){
			count += map[key] % 2;
		}
		return count <= 1;
	}
	// using hashMap
	/*
	 * We traverse over the given string For every new character found in string str
	 *  we create a new entry in the  map andmap for this character 
	 *  with the number of occurences as 1.
	 *  Whenever we find the same character again, 
	 *   we update the number of occurences appropriately.
	 *   At the end, we traverse over the map created and 
	 *   find the number of characters with odd number of occurences.
	 *   If this count happens to exceed 1 at any step, we conclude that a palindromic 
	 *   permutation isn't possible for the string 
	 *    But, if we can reach the end of the string with 
	 *    count lesser than 2, we conclude that a palindromic permutation is possible for string
	 *    Time complexity of O(n)
	 */
	boolean isPermutationSecondMethod(String str){
		// making new hashmap 
		HashMap<Character, Integer> map = new HashMap<>();
		// looping through the string and setting and putting into hasmap
		// then we are getting the key 
		for(int i = 0; i < str.length(); i++){
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0) + 1);
		}
		int count  = 0;
		// checking for even and odd chars in our hash map set
		for (char key : map.keySet())
		{
			count += map.get(key) % 2;
			
		}
		return count <=1;
	}
}
