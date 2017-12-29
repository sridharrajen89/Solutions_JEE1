package test.com;

public class StringServiceProvider {
	
	
	public static char findCharacterAtPosition(String str,int postion){
		 	char str1=str.charAt(postion);
			System.out.println("Character at "+postion+" position is:"+str1);
			return str1;
	}
	
	public static String reverseString(String str) {
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("reversed statement:"+reverse);
		return reverse;
		
	}
	
	public static String findAndReplace(String str) {
		String replaced=str.replaceAll("at position","in a string");
		System.out.println("replaced string:"+replaced);
		return replaced;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//finding the position of character in a string
		String str="Finding character at position";
		StringServiceProvider.findCharacterAtPosition(str, 0);
		StringServiceProvider.findCharacterAtPosition(str,10);

//reverse a given string
		StringServiceProvider.reverseString(str);
		
//search and replace character in a string
		StringServiceProvider.findAndReplace(str);
		
		
	}

}
