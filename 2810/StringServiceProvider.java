package com.htc.Exc2;

public class StringServiceProvider {
	private String stringNm;
	public static boolean findKeyinString(String str,char key){
		boolean flag=false;
		char[] str1=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(key==str1[i]){
				flag=true;
				System.out.println("Char "+ key +" Found");
				break;				
			}
		}
		if(!flag){
			System.out.println("Char"+ key +"Not found");
		}
		return flag;
	}
	public static String findKeyandReplacestring(String str,char key, char newkey){
		boolean flag=false;
		char[] str1=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(key==str1[i]){
				str1[i] = newkey;
			flag=true;
			}
		}
		if(!flag){
			System.out.println("Not found");
		}
		System.out.println("Replace String "+ key +" with " + newkey +" : " +String.valueOf(str1)); 
		return str; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringNm = "Udayapandian",stringChg;
		 stringChg = new StringBuffer(stringNm).reverse().toString();
		 System.out.println("Given String : "+stringNm);
		 System.out.println("Reversed String : "+stringChg);
		 StringServiceProvider.findKeyinString(stringNm, 'U');
		 StringServiceProvider.findKeyandReplacestring(stringNm, 'n', 'a');		
	}

}
