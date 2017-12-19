package com.htc.corejava.trainingexcerise.week1;

public class StringServiceProviderNonStatic {
	@SuppressWarnings("unused")
	private String inpStr= "NULL";
	public StringServiceProviderNonStatic() {
		// TODO Auto-generated constructor stub
		inpStr = "NULL";
	}
	public StringServiceProviderNonStatic(String inputString) {
		this.inpStr = inputString;
	}
	public String reverseString(String inputString) {
		char[] inputStringChars = inputString.toCharArray();
		char[] revInputStringChars = new char[inputString.length()];
		int j=0;
		for(int i=inputStringChars.length-1; i>=0 ; i--) {
			revInputStringChars[j++] = inputStringChars[i];
		}
		String revInputString = String.valueOf(revInputStringChars);
		return revInputString;
	}
	public int searchCharInString(String inputString, char searchChar) {
		char[] inputStringChars = inputString.toCharArray();
		int found=0, i=0;
		for(i=0; i<inputStringChars.length ; i++) {
			if (inputStringChars[i] == searchChar) {
				found = 1;
				break;
			}
		}
		if (found == 1)
			return i;
		else
			return 0;
	}
	public String searchAndReplaceInString(String inputString, String fromString, String toString) {
		String replaceString = inputString.replaceAll(fromString,toString);
		return replaceString;
	}
}