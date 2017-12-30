package com.htc.week1;

import java.nio.charset.StandardCharsets;

public class SringServiceProvider {

		public static String reverseStr(String str) {
			byte[] byteArray = str.getBytes();
			int len = str.length();
			for(int i=0; i<len/2; i++){
			byte temp = byteArray[i];
			byteArray[i]=byteArray[len-1-i];
			byteArray[len-1-i] = temp;
			}
			
			return new String(byteArray, StandardCharsets.UTF_8);
				}
		public int searchStr(String str, String pattern) {
			return str.indexOf(pattern);
			}
		public String replaceStr(String str, String search, String replace) {
			return str.replace(search, replace);
		}
}
