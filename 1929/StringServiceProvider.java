package com.htc.week1;

public class StringServiceProvider {

	public void reverseString(String str) {
		for(int i=str.length()-1;i>0;i--) {
			System.out.println(str.charAt(i));
		}
		
	}
	public static boolean linearSearch(String str1,char search) {
		boolean flag=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==search) {
				flag=true;
				System.out.println(search+" is present at location "+(i+1));
				break;
			}
		
		}
		return flag;
	}
	public void replaceString(String originalString,String toReplace,String replaceString) {
		
	      String [] temp=originalString.split(" ");
	      int len=temp.length;
	      String ne = "";
	      for(int i=0;i<len;i++)
	      {
	          if(temp[i].matches(toReplace))
	              temp[i]=replaceString;
	          ne=ne+temp[i]+" ";

	      }
	        System.out.println(ne);
	    }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringServiceProvider objString= new StringServiceProvider();
		System.out.println("Reverse String:::::::");
		objString.reverseString("Jave Training");
		System.out.println("Linear Search Word:::::::");
		StringServiceProvider.linearSearch("SuperGoodMan", 'G');
		System.out.println("Replace String::::::");
		objString.replaceString("Insusance was a domain", "was","is");
	}


}
