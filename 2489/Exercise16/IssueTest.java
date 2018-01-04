package com.htc.exe4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IssueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Issue> ilist = new ArrayList<Issue>();
		;
		try {
			FileReader	fis = new FileReader("D:\\JaveOffice\\issues.txt");
			BufferedReader bis = new BufferedReader(fis);
			String str;
			while((str = bis.readLine())!=null) 
			{
				String[] values = str.split(",");
				int issueID = Integer.parseInt(values[0]);
				Date date1=new SimpleDateFormat("ddmmyyyy").parse(values[1]);
				ilist.add(new Issue(issueID, date1, values[2], values[3]));			
			}
			System.out.println(ilist);
			bis.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
