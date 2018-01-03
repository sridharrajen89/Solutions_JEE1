package com.htc.Exc2;

import java.io.*;
import java.util.*;
import java.awt.*;

public class TestIssues extends Exception{

	public static void main(String[] args) throws IOException {
	    ArrayList<Issues> issue = new ArrayList<Issues>();
		try {
		    BufferedReader br = new BufferedReader(new FileReader("C://Users//Udayapandian//Desktop//issues.txt"));
					String line = null;
					while ((line = br.readLine()) != null) 
					{
						String[] s = line.split(",");
						int issueId = Integer.parseInt(s[0]);
						String issueGeneratedDate = s[1];
						int issueCategory = Integer.parseInt(s[2]);
						String issueDescription = s[3];	
						//adding to ArrayList
						Issues is= new Issues(issueId,issueGeneratedDate,issueCategory,issueDescription);
						issue.add(is);	
						System.out.println(is);
					}
					br.close();
		}
		catch (IOException EX) {
			EX.printStackTrace();
		}
		finally { System.out.println("Inside Finally");}
	}
}