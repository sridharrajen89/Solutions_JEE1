package excercise3;

public class StringServiceProvider {
	
	/*
	 * method is used to reverse a string
	 */
	public StringBuffer reverse(String inputString) {
		StringBuffer sb = new StringBuffer(inputString);
		/*String str = "";
		
		char[] strArray = inputString.toCharArray();
		
		for(int i=strArray.length-1; i>=0; i--) {
			str += strArray[i];
		}*/
		return sb.reverse();
		//return str;
	}
	
	/*
	 * method is used to find a character in given string
	 */
	public int find(String inputString, char inputChar) {
		
		/*char[] strArray = inputString.toCharArray();
		for(int i=0; i < strArray.length; i++){
			if(strArray[i] == inputChar){
				return i;
			}
		}
		//return -1;
*/		
		return inputString.indexOf(inputChar);
	}
	
	/*
	 * method is used to find a character in string and replace it with given character
	 */
	public String findAndReplace(String inputString, char searchChar, char replaceChar) {
		/*String resString = "";
		char[] strArray = inputString.toCharArray();
		
		for(int i=0; i < strArray.length; i++){
			if(strArray[i] == searchChar){
				resString += replaceChar;
			}else {
				resString += strArray[i];
			}
		}*/
		return inputString.replace(searchChar, replaceChar);
		//return resString;
	}
	public static void main(String args[]) {
		StringServiceProvider obj = new StringServiceProvider();
		System.out.println("-----reverse-----"+obj.reverse("miamia"));
		System.out.println("------linear search index----"+ obj.find("find me", 'm'));
		System.out.println("------find and replace char----"+ obj.findAndReplace("find me", 'm', 'a'));
	}
}
