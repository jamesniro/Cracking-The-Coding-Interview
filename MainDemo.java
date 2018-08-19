
public class MainDemo {
	
	
	public static void main(String[] args){
		
		// test function for isUnique
//		IsUnique unique = new IsUnique();
//		String input = "laalasvdfdsasss";
//		String input2 = "asdfgh1234";
//		
//		if(unique.isUniqueString(input2)){
//			System.out.println("The String is Unique");
//		} else {
//			System.out.println("Not Unique");
//		}
//		
//		if(unique.isUniqueChar(input)){
//			System.out.println("The String is Unique");
//		} else {
//			System.out.println("Not Unique");
//		}
		// test function ends for isUnique
		
		CheckPermutation permutation = new CheckPermutation();
		
		String str = "LISTEN";
		String str2 = "SILENT";
		if(permutation.checkPerm(str, str2)){
			System.out.println("Yes it is perm");
		}else{;
			System.out.println("not it is not");
		}
		
		
	}

}
