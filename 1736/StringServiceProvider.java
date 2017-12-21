package com.htcinc.oops;
/*
3. Prepare a StringServiceProvider class which has the following methods   
(a) To reverse a given string   
(b) To do linear search in a given string   
(c) To do search and replace operation in a given string  

Note: code the requirement with 2 possibilities (with and without static methods)
 */

public class StringServiceProvider {
	
	public String originalText;
	
	public StringServiceProvider(String originalText) {
		super();
		this.originalText = originalText;
	}

	public static String reverseString(String originalString) {
		int len=originalString.length();
		char [] reversedString= new char[len -1];
		for (int i=len-1,j=0; i>=0;i--,j++) {
			reversedString[j]=originalString.charAt(i);
		}
		 return reversedString.toString();
	}
	
	//Finds only the first position of the substring in the main string.. need to make it robust to handle multiple occurences
	public static int linearSearch(String originalString, String subString) {
		
		char[] originalStr=originalString.toCharArray();
		char[] subStr=subString.toCharArray();
		int foundPosition=-1;
		int lenSub=subStr.length;
		
		int j=0;
		for (int i=0; i < originalStr.length;i++, j++) {
			if (subStr[j]==originalStr[i]) {
				//Finding if the whole of substring is present in the original string 
				for (int k=0,l=i; k < lenSub;k++, l++) {
					if (subStr[k]==originalStr[l]) {
						if (k==(lenSub-1))
							//found=true;
							foundPosition=i;
							i+=k;
							break;								
					}	
				}
			}		
		}
	return foundPosition;
		//return originalString.indexOf(subString); //shortcut using string methods
	}
	
	//Assuming replacingText and newText are of the same size.. need to make it robust to include different sized strings
	public static String searchReplace(String originalString, String replacingText, String newText) {
		char[] originalStr=originalString.toCharArray();
		char[] replacingTxt=replacingText.toCharArray();
		char[] newTxt=newText.toCharArray();
		
		int position=-1;
		
		if (replacingText.length() == newText.length()) {
			for (int i=0; i<originalStr.length;i++) {
				position=StringServiceProvider.linearSearch(originalString, replacingText);
				if (i == position) {
					int j;
					for (j=0; j < replacingTxt.length;j++,i++) {
						originalStr[i]=newTxt[j];
					}
				}
			}
		}
		return originalStr.toString();
		//return originalString.replaceAll(replacingText, newText);   //shortcut using string methods
	}

	public String getOriginalText() {
		return this.originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}
	
	public String reverseString() {
		int len=this.originalText.length();
		char [] reversedString= new char[len -1];
		for (int i=len - 1,j=0; i<=0;i--,j++) {
			reversedString[j]=originalText.charAt(i);
		}
		 return reversedString.toString();
	}
	
	//Finds only the first position of the substring in the main string.. need to make it robust to handle multiple occurences
	public int linearSearch(String subString) {
		
		char[] originalStr=originalText.toCharArray();
		char[] subStr=subString.toCharArray();
		int foundPosition=-1;
		int lenSub=subStr.length;
		
		int j=0;
		for (int i=0; i < originalStr.length;i++, j++) {
			if (subStr[j]==originalStr[i]) {
				//Finding if the whole of substring is present in the original string 
				for (int k=0,l=i; k < lenSub;k++, l++) {
					if (subStr[k]==originalStr[l]) {
						if (k==(lenSub-1))
							//found=true;
							foundPosition=i;
							i+=k;
							break;								
					}	
				}
			}		
		}
		return foundPosition;
		//return this.originalText.indexOf(subString);  // short cut using String methods
	}
	
	//Assuming replacingText and newText are of the same size.. need to make it robust to include different sized strings
	public String searchReplace(String replacingText, String newText) {
		
		char[] originalStr=originalText.toCharArray();
		char[] replacingTxt=replacingText.toCharArray();
		char[] newTxt=newText.toCharArray();
		
		int position=-1;
		
		if (replacingText.length() == newText.length()) {
			for (int i=0; i<originalStr.length;i++) {
				position=StringServiceProvider.linearSearch(originalText, replacingText);
				if (i == position) {
					int j;
					for (j=0; j < replacingTxt.length;j++,i++) {
						originalStr[i]=newTxt[j];
					}
				}
			}
		}
		return originalStr.toString();
		
		// return this.originalText.replaceAll(replacingText, newText);  // using String methods
	}

}
