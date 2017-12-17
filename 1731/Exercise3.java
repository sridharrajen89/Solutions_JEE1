package htc.test;

// sample programs with static methods , remove the output phase in  StringServiceProvider
class StringServiceProvider {

	public static boolean findKeyinString(String str,char key){
		boolean flag=false;
		char[] str1=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(key==str1[i]){
				flag=true;
				System.out.println();
				System.out.println("Found " +key);
				System.out.println();
				break;				
			}
		}
		if(!flag){
			System.out.println("Not found");
		}
		return flag;
	}
	
		
	public static char findCharecterAtPosition(String str,int postion){
		char str1=str.charAt(postion);
		System.out.println("Character at"+postion+"position is:"+str1);
		return str1;

	}
	public static String subString(String str,int startPosition,int endPosition){
		char[] str1=str.toCharArray();
		char[] subString=new char[18];
		int j=0;
		for(int i=startPosition;i<=endPosition;i++){
			subString[j]=str1[i];
			
			j++;
		}
		System.out.println(subString);
	
		return null;

	}

	public static void reverseString(String str){

		char[] revstring = str.toCharArray();
		int len=revstring.length-1;

		for(int i=len;i>=0;i--){
				System.out.print(revstring[i]);
			}	
		System.out.println();
		System.out.println("Original Text is-" + str);
		}

}

public class Exercise3 {
	public static void main(String args[]){
		String str="Test Reverse String for Testing";
		StringServiceProvider.reverseString(str);
		StringServiceProvider.findKeyinString(str, 'R');
		FindAndReplace(str);


	}

	private static void FindAndReplace(String Text) {
		  String s = Text;
		  String replacement = "Replace";
	      String s1 = s.replaceAll("Test", replacement);
	      System.out.println("Original Test--" + s);
	      System.out.println("Replaced all occurrences of Test with word Replace--" + s1);
	}
}

