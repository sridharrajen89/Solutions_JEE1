package excercise3;

public class StringStaticServiceProvider {
	
	/*
	 * Static method is used to reverse a string
	 */
	public static String reverse(String inputString) {
		String str = "";
		
		char[] strArray = inputString.toCharArray();
		
		for(int i=strArray.length-1; i>=0; i--) {
			str += strArray[i];
		}
		
		return str;
	}
	
	/*
	 * Static method is used to find a character in given string
	 */
	public static int find(String inputString, char inputChar) {
		char[] strArray = inputString.toCharArray();
		for(int i=0; i < strArray.length; i++){
			if(strArray[i] == inputChar){
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * static method is used to find a character in string and replace it with given character
	 */
	public static String findAndReplace(String inputString, char searchChar, char replaceChar) {
		String resString = "";
		char[] strArray = inputString.toCharArray();
		
		for(int i=0; i < strArray.length; i++){
			if(strArray[i] == searchChar){
				resString += replaceChar;
			}else {
				resString += strArray[i];
			}
		}
		return resString;
	}
	public static void main(String args[]) {
		System.out.println("-----reverse-----"+reverse("miamia").toString());
		System.out.println("------linear search index----"+ find("find me", 'm'));
		System.out.println("------find and replace char----"+ findAndReplace("find me", 'm', 'a').toString());
	}
}
