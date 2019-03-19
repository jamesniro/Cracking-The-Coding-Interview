package chapterOne;

public class Demo {

	
	public static void main(String[] args){
		
		IsUnique unique = new IsUnique();
		
		String str = "1234567";
		String str2 = "12345621";
		System.out.println(unique.uniqueSString(str));
		System.out.println(unique.uniqueSString(str2));
	}
}
