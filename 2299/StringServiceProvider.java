package htc.exercises.week1;

public class StringServiceProvider {

	public static String reverseString(String stringName) {
		int length = stringName.length() - 1;
		String newStringName = "";
		for (int i = 0; i < stringName.length(); i++) {
			newStringName += stringName.charAt(length - i);
		}
		return newStringName;
	}

	public static int searchString(String stringName, char value) {
		int stringValue = 0;
		for (int i = 0; i < stringName.length(); i++) {
			if (value == stringName.charAt(i)) {
				stringValue = i + 1;
				break;
			}
		}
		return stringValue;
	}

	public static String replaceString(String givenStr, char findChar, char replaceString) {
		String finalString = "";
		for (int i = 0; i < givenStr.length(); i++) {
			if (findChar == givenStr.charAt(i)) {
				finalString = finalString + replaceString;
			} else {
				finalString = finalString + givenStr.charAt(i);
			}
		}
		return finalString;

	}

	public static void main(String[] args) {

		System.out.println("Reverse of Prabakaran is "+reverseString("Prabakaran"));
		System.out.println("Char position k in String Prabakaran is "+searchString("Prabakaran", 'k'));
		System.out.println(replaceString("Prabakaran", 'a','b'));
	}

}
